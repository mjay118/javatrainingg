package com.main;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Patient;

public class PatientRegister extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		Patient pat=new Patient();
		pat.setPatient_name(request.getParameter("patient_name"));
		pat.setPatient_gender(request.getParameter("patient_gender"));
		pat.setDate_of_birth(request.getParameter("d_o_b"));
		pat.setPatient_email(request.getParameter("patient_email"));
		pat.setPatient_password(request.getParameter("patient_password"));
		pat.setPatient_phone(request.getParameter("patient_phone"));
		pat.setPatient_address(request.getParameter("patient_address"));
		
		boolean patient_registration_status=false;
		 patient_registration_status=PatientRegisterBean.register(pat);
	//	System.out.println(patient_registration_status);
		 if(patient_registration_status)
		 {
			 response.sendRedirect("./patient_login.html?msg=Registered Successfully");
		 }
		 else
			 response.sendRedirect("./patient_registration.html?msg=Registration Faliled");
		
	}
}	