package com.main;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pojo.Patient;

public class PatientLogin extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String email=request.getParameter("patient_email");
		String password=request.getParameter("patient_password");
		Patient p=PatientLoginBean.login(email, password);
		HttpSession hs=request.getSession();
		if(p!=null) {
			hs.setAttribute("patient_id",p.getPatient_id() );
			response.sendRedirect("./patient_home.jsp?msg=login sucessfully");
		}
		else
			response.sendRedirect("./patient_login.html?msg=login failed");
	}

}