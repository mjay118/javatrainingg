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

public class SearchDoctor extends HttpServlet {
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
	
	String specialisation=request.getParameter("specialisation");
	
	PrintWriter pw=response.getWriter();

	String sql="select id,name,email,phone,specialisation from doctor where specialisation=?";
	
	try {
		
		ps=con.prepareStatement(sql);
		
		ps.setString(1, specialisation);
		
		
		
		ResultSet rs =ps.executeQuery();
		pw.println("<html><body bgcolor='wheat'><center><h1><i>LIST OF DOCTORS AVALIABLE </i></h1></center><br><br>");
		pw.println("<center><a href=index.html>Home |</a>");
		pw.println("<a href=patient_home.html>Patient Home |</a>");
		pw.println("<a href=takeappointment.html>Take Appointment </a></center><br><br>");
		pw.println("<center><table border=1 width=20% height=20%><tr><td>Id No.</td><td>Name</td><td>Email</td><td>Phone</td><td>Specialisation</td></tr>");
		
		if(rs.next()) {
			
		pw.println("<tr><td>" + rs.getInt(1) + "</td><td>" + rs.getString(2) + "</td><td>" + rs.getString(3) + "</td><td>" + rs.getInt(4) + "</td><td>" + rs.getString(5) + "</td></tr>");
		
		}
		/*else {
			pw.println("<html><body><center><h1><i>Sorry, No Doctor Available</i></h1></center></body></html>");
		}*/

		pw.println("</table></center><br><br>");  
		pw.println("<center><h3><i>Note:- Remember the id of concerned Doctor, you need during making an appointment<i></h3></center>");
        pw.println("</body></html>"); 
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}

}
