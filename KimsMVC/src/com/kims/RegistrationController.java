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

public class RegistrationController extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String phone=request.getParameter("phone");
		long mobile=Long.parseLong(phone);
		String specialisation=request.getParameter("specialisation");
		boolean status=false;
		RegistrationBean rb=new RegistrationBean();
		rb.setName(name);
		rb.setEmail(email);
		rb.setPassword(password);
		rb.setPhone(mobile);
		rb.setSpecialisation(specialisation);
		HttpSession hs=request.getSession();
		hs.setAttribute("regbeans", rb);
		try {
			status=rb.register(name, email,password, mobile, specialisation);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status)
			response.sendRedirect("./doctor_login.html?msg=registered sucessfully");
		else
			response.sendRedirect("./doctor_register.html?msg=registered failed");
	}

}
