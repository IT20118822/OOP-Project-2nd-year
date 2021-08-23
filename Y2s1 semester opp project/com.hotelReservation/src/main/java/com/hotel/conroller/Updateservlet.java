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
import com.hotel.Dao.RegisterDao;
import com.hotel.model.Customer;


@WebServlet("/Update")
public class Updateservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Customer cus = new Customer();
		
		cus.setcustomerName(request.getParameter("customerName"));
		cus.setfatherName(request.getParameter("fatherName"));     
		cus.setcustomerEmail(request.getParameter("customerEmail"));
	    cus.setpassword(request.getParameter("password"));
		cus.setaddress(request.getParameter("address"));
		cus.setphoneNumber(request.getParameter("phoneNumber"));
        cus.setcustomerid(Integer.parseInt(request.getParameter("customerid")));
	  
		/* cus.setcustomerid(customerid1); */
		
		/*
		 * String customerid = request.getParameter("customerid");
		 * session.setAttribute("customerid", customerid);
		 */
		
		/*
		 * Customer Updatecustomer = new Customer( customerid
		 * ,customerName,fatherName,customerEmail,password,address,phoneNumber);
		 */
		
		  System.out.println(cus.getcustomerid());
		  System.out.println(request.getParameter("customerid"));
		  System.out.println(Integer.parseInt(request.getParameter("customerid")));
		 
	
		
        CustomerDao Cdao = new CustomerDao();
        
        try {
			Cdao.updateCustomer(cus);
			/*
			 * HttpSession session = request.getSession();
			 * session.setAttribute("suessfully update", Cdao);
			 */
			RequestDispatcher rd = request.getRequestDispatcher("Profile.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
	}










	



}
