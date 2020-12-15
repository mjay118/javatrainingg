package com.kims;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AppointmentController extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String date = request.getParameter("date");
		String time = request.getParameter("time");
		String specialisation = request.getParameter("specialisation");
		HttpSession hs=request.getSession();
		
		boolean status=false;
		
		try {
			status=new AppointmentBean().apply(id, name, email, date, time, specialisation);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status)
			response.sendRedirect("takeappointment.html?msg=applied sucessfully");
		else
			response.sendRedirect("takeappointment.html?msg=applied failed");
	}

}
