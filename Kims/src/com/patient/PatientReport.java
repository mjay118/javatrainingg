package com.patient;

import java.io.IOException;
import java.io.PrintWriter;
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

public class PatientReport extends HttpServlet {
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
	
	PrintWriter pw=response.getWriter();

	String sql="select * from pathologyReport where email=?";
	
	try {
		
		ps=con.prepareStatement(sql);
		
		ps.setString(1, email);
		
		
		
		ResultSet rs =ps.executeQuery();
		pw.println("<html><body bgcolor='wheat'><center><h1>MY REPORT</h1></center><br><br>");
		pw.println("<center><table border=1 width=20% height=20%><tr><td>id</td><td>name</td><td>email</td><td>date</td><td>Blood Group</td><td>Test</td><td>Finding</td></tr>");
		
		while(rs.next()) {
			
		pw.println("<tr><td>" + rs.getInt(1) + "</td><td>" + rs.getString(2) + "</td><td>" + rs.getString(3) + "</td><td>" + rs.getString(4) + "</td><td>" + rs.getString(5) + "</td><td>" + rs.getString(6) + "</td><td>" + rs.getString(7) + "</td></tr>");
		
		
		}
		pw.println("</table></center>");  
        pw.println("</body></html>"); 
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}

}
