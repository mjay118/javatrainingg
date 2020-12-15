package com.kims;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PatientLoginController extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{

		String email=request.getParameter("patient_email");
		String password=request.getParameter("patient_password");
		PatientLoginBean pb=new PatientLoginBean();
	    pb.setEmail(email);
		pb.setPassword(password);
		HttpSession hs=request.getSession();
		
		
		PatientRegistrationBean prb=null;
		
		
			try {
				prb =new PatientLoginBean().loginValidate(email, password);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(prb!=null) {
				 hs.setAttribute("patient", prb);
				hs.setAttribute("id",  prb.getId());
				hs.setAttribute("name", prb.getName());
				response.sendRedirect("./patient_home.html");
			}
			else
			{
				response.sendRedirect("./patient_login.html?msg=unsucessful");

			}
	}

}
