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

public class Appointment extends HttpServlet {
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
	String id=request.getParameter("id");
	int id1=Integer.parseInt(id);
	String name=request.getParameter("name");
	String email=request.getParameter("email");
	String date=request.getParameter("date");
	String time=request.getParameter("time");
	String specialisation=request.getParameter("specialisation");
	
	PrintWriter pw=response.getWriter();

	String sql="insert into appointment(id,name,email,date,time,specialisation) values(?,?,?,?,?,?)";
	
	try {
		
		ps=con.prepareStatement(sql);
		
		ps.setInt(1, id1);
		ps.setString(2, name);
		ps.setString(3, email);
		ps.setString(4, date);
		ps.setString(5, time);
		ps.setString(6, specialisation);
		
		int x=ps.executeUpdate();
		if(x!=0) {
			
			pw.println("<html><body bgcolor='wheat'><center><h1><i>Appointment taken</i></h1></center></body></html>");
		
		
		}
		else {
			pw.println("<html><body><center><h1><i>Error Occured</i></h1></center></body></html>");
		}
			
			
		pw.println("</table></center><br><br>");  
        pw.println("</body></html>"); 
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}

}
