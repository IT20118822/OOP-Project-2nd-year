package com.hotel.conroller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hotel.Dao.CustomerDao;
import com.hotel.model.Customer;


@WebServlet("/delete")
public class deleteservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		session.getAttribute("customerEmail");
		
		/* String password = request.getParameter("password"); */
		CustomerDao dao = new CustomerDao();
		Customer cus1 = new Customer();
		 
		cus1.setcustomerEmail(session.getAttribute("customerEmail").toString());
		/* cus.setpassword(password); */
		
		
		try {
			if(dao.deletecustomer(cus1)) {
				response.sendRedirect("Home.jsp");
			}
			else {
				response.sendRedirect("Profile.jsp");
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
