package com.main;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Pathologist;

public class PathologistRegister extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		Pathologist path=new Pathologist();
		path.setDoctor_name(request.getParameter("doctor_name"));
		path.setGender(request.getParameter("gender"));
		path.setDoctor_email(request.getParameter("doctor_email"));
		path.setDoctor_password(request.getParameter("doctor_password"));
		path.setDoctor_phone(request.getParameter("doctor_phone"));
		path.setDoctor_specialisation(request.getParameter("doctor_specialisation"));
		path.setDoctor_experience(request.getParameter("doctor_experience"));
		path.setDoctor_address(request.getParameter("doctor_address"));
		
		boolean pathologist_registration_status=false;
		pathologist_registration_status=PathologistRegisterBean.register(path);
	//	System.out.println(pathologist_registration_status);
		 if(pathologist_registration_status)
		 {
			 response.sendRedirect("./pathologist_login.html?msg=Registered Successfully");
		 }
		 else
			 response.sendRedirect("./pathologist_registration.html?msg=Registration Faliled");
		
	}
}	