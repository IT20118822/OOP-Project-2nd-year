package com.hotel.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import org.apache.jasper.tagplugins.jstl.core.Out;

import java.awt.Desktop.Action;

import com.hotel.model.Customer;
import com.mysql.cj.xdevapi.Statement;

public class LoginDao {

		DBconnection database = new DBconnection();
	public boolean check(String customerEmail,String passW)
	{
		try {
			String sql = "select * from customer where customerEmail=? and password=?";
			Connection con = database.getConnection();
			PreparedStatement st =con.prepareStatement(sql);
			st.setString(1, customerEmail);
			st.setString(2, passW);
		
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				
				return true; 
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	
		
		return false;
		
	}
    
    public static Customer selectcustomer(String Email) throws ClassNotFoundException, SQLException {
  	  DBconnection database = new DBconnection();
  	  Connection con = database.getConnection();
  	  Customer cus1 = new Customer();
  	 
  	
  	  PreparedStatement ps =con.prepareStatement("SELECT * FROM customer customerEmail =?");
  	  
  	   ps.setString(1, Email);
  	     ResultSet rs = ps.executeQuery();
  	    if(rs.next()) {
  	    
  	    Customer cus = new Customer();
  	    cus.setcustomerid(rs.getInt("customerid"));
  	    cus.setcustomerName(rs.getString("customerName"));
  	    cus.setfatherName(rs.getString("fatherName"));
  	    cus.setcustomerEmail(rs.getString("customerEmail"));
  	    cus.setpassword(rs.getString("password"));
  	    cus.setaddress(rs.getString("address"));
  	    cus.setphoneNumber(rs.getNString("phoneNumber"));
  	  
  	    
  	    	cus1 = cus;
  	    
  	    
  	    }
	   
  	  
		return cus1;
		

  	   
		   
		   
		   
    }
    
    public static Customer selectid(String Email) throws ClassNotFoundException, SQLException {
  	  DBconnection database = new DBconnection();
  	  Connection con = database.getConnection();
  	  Customer cus1 = new Customer();
  	PreparedStatement ps =con.prepareStatement("SELECT customerid FROM customer customerEmail =?");
	  
	   ps.setString(1, Email);
	     ResultSet rs = ps.executeQuery();
	    if(rs.next()) {
	    	Customer cus = new Customer();
	        cus.setcustomerid(rs.getInt("customerid"));
	        cus1 = cus;
	    }
    	
		return cus1 ;
    	
    }
    
    
    

	
	
	

}
