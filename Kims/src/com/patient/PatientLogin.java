package com.patient;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PatientLogin extends HttpServlet {
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
	
	String email=request.getParameter("patient_email");
	String password=request.getParameter("patient_password");

	String sql="select * from patient where email=? and password=?";
	
	try {
		
		ps=con.prepareStatement(sql);
		
		ps.setString(1, email);
		ps.setString(2, password);
		
		HttpSession hs=request.getSession();
		ResultSet rs =ps.executeQuery();
		
		if(rs.next()) {
		hs.setAttribute("semail", email);	
		hs.setAttribute("id", rs.getInt(1));
		response.sendRedirect("./patient_home.html?msg=login success");
		
		}
		else {
			response.sendRedirect("./patient_home.html?msg=login Unsuccessful");	
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}

}
