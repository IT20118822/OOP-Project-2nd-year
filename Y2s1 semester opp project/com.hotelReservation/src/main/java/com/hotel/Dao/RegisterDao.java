package com.hotel.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hotel.model.Customer;
import com.mysql.cj.xdevapi.PreparableStatement;
import com.mysql.cj.xdevapi.Statement;

public class RegisterDao {
	
	
	

	         	
		

	
public void AddCustomer(Customer customer)throws SQLException, ClassNotFoundException{
				

			 String result;
			    DBconnection database = new DBconnection();			
				Connection conn = (Connection) database.getConnection();

				 try {
					 
				PreparedStatement ps =conn.prepareStatement("INSERT INTO customer(customerName,fatherName,customerEmail,password,address,phoneNumber) VALUES (?,?,?,?,?,?)");
			
					
						ps.setString(1, customer.getcustomerName());
						ps.setString(2, customer.getfatherName());
						ps.setString(3, customer.getcustomerEmail());
						ps.setString(4, customer.getpassword());
						ps.setString(5, customer.getaddress());
						ps.setString(6, customer.getphoneNumber());
						
						ps.executeUpdate();
						 
						
						
						
				
			}
			catch(Exception e) {
				System.out.println("e");
				e.printStackTrace();
				result = "this error";
				System.out.println(result);
				
			}
			
			/* return result; */
			
			
			
	}




} 

