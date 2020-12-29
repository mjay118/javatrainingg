package com.main;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Patient;

public class PatientUpdate extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException 
	{
	
		Patient pat=new Patient();
		pat.setPatient_id(Integer.parseInt(request.getParameter("patient_id")));
		pat.setPatient_name(request.getParameter("patient_name"));
		pat.setPatient_gender(request.getParameter("Patient_gender"));
		pat.setDate_of_birth(request.getParameter("d_o_b"));
		pat.setPatient_email(request.getParameter("patient_email"));
		pat.setPatient_password(request.getParameter("patient_password"));
		pat.setPatient_phone(request.getParameter("patient_phone"));
		pat.setPatient_address(request.getParameter("patient_address"));
		
		
		boolean patient_update_status=false;
		 patient_update_status=PatientUpdateBean.update(pat);
	
		 if(patient_update_status)
		 {
			 response.sendRedirect("./patient_profile.jsp?id="+pat.getPatient_id()+"msg=Updated Successfully");
		 }
		 else
			 response.sendRedirect("./patient_profile.jsp?id="+pat.getPatient_id()+"msg=Update Failed");		
	}
}
