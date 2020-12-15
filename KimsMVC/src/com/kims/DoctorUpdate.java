package com.kims;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DoctorUpdate extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String phone=request.getParameter("phone");
		long mobile=Long.parseLong(phone);
		String specialisation=request.getParameter("specialisation");
		boolean status=false;
		DoctorUpdateBean ub=new DoctorUpdateBean();
		ub.setId(id);
		ub.setName(name);
		ub.setEmail(email);
		ub.setPhone(mobile);
		ub.setSpecialisation(specialisation);
		HttpSession hs=request.getSession();
		RegistrationBean rb=null;
		try {
			rb=ub.update(name, email,password, mobile, specialisation);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(rb!=null) {
		    hs.setAttribute("doc", rb);
		    response.sendRedirect("doctor_profile.jsp?msg=updated sucessfully");
	}else
		response.sendRedirect("doctor_profile.jsp?msg= not updated");
}

}