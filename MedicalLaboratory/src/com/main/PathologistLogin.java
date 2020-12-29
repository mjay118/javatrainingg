package com.main;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PathologistLogin extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String email=request.getParameter("doctor_email");
		String password=request.getParameter("doctor_password");
		boolean pathologist_login_status=false;
		pathologist_login_status=PathologistLoginBean.login(email, password);
		if(pathologist_login_status) {
			response.sendRedirect("./pathologist_home.jsp?msg=login sucessfully");
		}
		else
			response.sendRedirect("./pathologist_login.html?msg=login failed");
	}

}