package com.hotel.conroller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hotel.Dao.RegisterDao;
import com.hotel.model.Customer;


@WebServlet("/Register")
public class Registerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Customer customer = new Customer();
			//HttpSession session = request.getSession();
			
			String customerName = (request.getParameter("customerName"));
			String fatherName = (request.getParameter("fatherName"));     
			String customerEmail = (request.getParameter("customerEmail"));
			String password = (request.getParameter("password"));
			String address = (request.getParameter("address"));
			String phoneNumber = (request.getParameter("phoneNumber"));
//        
//       System.out.println(customerName);
		Customer newcustomer = new Customer(6, customerName,fatherName,customerEmail,password,address,phoneNumber);
	
	
        RegisterDao dao = new RegisterDao();
       

            

			try {
				dao.AddCustomer(newcustomer);
				response.sendRedirect("Login.jsp");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
			
			
	
	     
			
		/*
		 * PrintWriter out = response.getWriter(); out.print(result);
		 */
        
      
//        RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
//		rd.forward(request, response);  

     
		
}
	}


