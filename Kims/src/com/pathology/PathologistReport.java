package com.pathology;

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


public class PathologistReport extends HttpServlet {
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
	String date=request.getParameter("date");
	String bloodGroup=request.getParameter("blood_Group");
	String test=request.getParameter("test_name");
	String finding=request.getParameter("finding");
	
	
	
	

	String sql="insert into pathologyReport(name ,email ,date ,blood ,test ,finding) values(?,?,?,?,?,?)";
	
	try {
		
		ps=con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, date);
		ps.setString(4,bloodGroup);
		ps.setString(5,test);
		ps.setString(6,finding);
		
		int x =ps.executeUpdate();
		
		if(x!=0) {
			
		response.sendRedirect("./pathology_successReport.html?msg=success");
		
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}

}
