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
import com.hotel.Dao.LoginDao;
import com.hotel.model.Customer;

@WebServlet("/Login")

public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String Email = request.getParameter("Email");
		String pass = request.getParameter("password");

		LoginDao dao = new LoginDao();

		if (dao.check(Email, pass)) {

			try {
				session.setAttribute("customerEmail", Email);
				   System.out.println("hiii");
				   Customer cus2 = LoginDao.selectid(Email);
				   int  customerid = cus2.getcustomerid();
				   session.setAttribute("customerid",customerid);
				   System.out.println(customerid);
				   System.out.println("hiiiiii");
					/* session.setAttribute("customer", cus); */
				 
				 
				  /*String customerName = cus1.getcustomerName();
				 * 
				  String fatherName = cus1.getfatherName(); String customerEmail =
				  cus1.getcustomerEmail(); String password = cus1.getpassword(); String address
				  = cus1.getaddress(); String phoneNumber= cus1.getphoneNumber(); int
				 *customerid = cus1.getcustomerid();
				  
				  
				  session.setAttribute("customerName", customerName);
				  session.setAttribute("fatherName", fatherName);
				  session.setAttribute("customerEmail", customerEmail);
				  session.setAttribute("password", password);
				  session.setAttribute("phoneNumber", phoneNumber);
				  session.setAttribute("customerid", customerid);
				  session.setAttribute("address", address);
				 
*/
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			/* response.sendRedirect("Profile.jsp"); */

			RequestDispatcher rd = request.getRequestDispatcher("Profile.jsp");
			rd.forward(request, response);

			/*
			 * RequestDispatcher rd = request.getRequestDispatcher("Profile.jsp");
			 * rd.forward(request, response);
			 */
			/* response.sendRedirect("Profile.jsp"); */

		} else {

			session.setAttribute("errorMessage", "ivalid details");
			response.sendRedirect("Login.jsp");
			/*
			 * RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			 * rd.forward(request, response);
			 */
		}
	}

}
