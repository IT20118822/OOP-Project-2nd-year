package com.hotel.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.ha.session.SessionMessage;

import com.hotel.model.Customer;
import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.Result;

public class CustomerDao {
	
	

   
public void  updateCustomer(Customer cus) throws ClassNotFoundException, SQLException {
		
		
	
		
		     DBconnection database = new DBconnection();
			
			Connection con = (Connection) database.getConnection();
			
				PreparedStatement ps =con.prepareStatement("UPDATE customer SET customerName= ? ,fatherName= ? ,customerEmail= ? ,password= ? ,address=? ,phoneNumber= ? WHERE customerid = ?");
			try {	
				ps.setString(1, cus.getcustomerName());
				ps.setString(2, cus.getfatherName());
				ps.setString(3, cus.getcustomerEmail());
				ps.setString(4, cus.getpassword());
				ps.setString(5, cus.getaddress());
				ps.setString(6, cus.getphoneNumber());
			    ps.setInt(7, cus.getcustomerid()); 
				
				
			      ps.executeUpdate();
				
				
				
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
		
}



            
      public boolean deletecustomer(Customer cus) throws ClassNotFoundException, SQLException{
    	  
    	  
    	  DBconnection database = new DBconnection();
    	  Connection con = database.getConnection();
    	  boolean result = false;
    	 
    	
    	  try {
    	  PreparedStatement ps =con.prepareStatement("SELECT * FROM customer WHERE customerEmail = ? ");

		   ps.setString(1, cus.getcustomerEmail());
		   ResultSet rs1 = ps.executeQuery();
		  
		   
		   
		   if( rs1.next())
		   {
			   PreparedStatement ps1 =con.prepareStatement("DELETE  FROM customer WHERE customerEmail = ? ");
			   ps1.setString(1, cus.getcustomerEmail());
			    ps1.executeUpdate();
			   
			   result = true;
		   }
		   else {
			   result = false;
		   }

    	  	
    	  }catch(Exception e){
    		  e.printStackTrace();
      }
		return result;

}
      



 

      
      

      
 
}
