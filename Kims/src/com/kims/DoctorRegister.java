package com.kims;

import java.io.IOException;
import java.io.PrintWriter;
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


public class DoctorRegister extends HttpServlet {
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
	
	String name=request.getParameter("name");
	String email=request.getParameter("email");
	String password=request.getParameter("password");
	String phone=request.getParameter("phone");
	long mobile=Long.parseLong(phone);
	String specialisation=request.getParameter("specialisation");

	String sql="insert into doctor(name,email,password,phone,specialisation) values(?,?,?,?,?)";
	
	try {
		
		ps=con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, password);
		ps.setLong(4, mobile);
		ps.setString(5, specialisation);
		int x =ps.executeUpdate();
		
		if(x!=0) {
			
		response.sendRedirect("./doctor_login.html?msg=registered");
		
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}

}
