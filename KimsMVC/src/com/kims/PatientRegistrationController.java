package com.kims;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PatientRegistrationController extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("patient_name");
		String email=request.getParameter("patient_email");
		String password=request.getParameter("patient_password");
		String phone=request.getParameter("patient_phone");
		long mobile=Long.parseLong(phone);
		boolean status=false;
		PatientRegistrationBean prb=new PatientRegistrationBean();
		prb.setName(name);
		prb.setEmail(email);
		prb.setPassword(password);
		prb.setPhone(mobile);
		HttpSession hs=request.getSession();
	
		try {
			status=prb.pregister(name, email, password, mobile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status)
			response.sendRedirect("./patient_login.html?msg=registered sucessfully");
		else
			response.sendRedirect("./patient_registration.html?msg=registered failed");
	}

}
