package com.patient;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PatientRegister extends HttpServlet {
	Connection con=null;
	PreparedStatement ps=null;
	public void init(ServletConfig config) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}	
	String url = "jdbc:mysql://localhost:3306/kims";
	String uname = "root";
	String pass = "1234";
	try {
		 con = DriverManager.getConnection(url, uname, pass);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	String name=request.getParameter("patient_name");
	String email=request.getParameter("patient_email");
	String password=request.getParameter("patient_password");
	String phone=request.getParameter("patient_phone");
	long mobile=Long.parseLong(phone);
	

	String sql="insert into patient(name,email,password,phone) values(?,?,?,?)";
	
	try {
		
		ps=con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, password);
		ps.setLong(4, mobile);
		
		int x =ps.executeUpdate();
		
		if(x!=0) {
			
		response.sendRedirect("./patient_login.html?msg=registered");
		
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}

}
