package com.kims;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginController extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{

		String email=request.getParameter("email");
		String password=request.getParameter("password");
		LoginBean lb=new LoginBean();
		lb.setEmail(email);
		lb.setPassword(password);
		HttpSession hs=request.getSession();
		
		RegistrationBean rb=null;
		
			try {
				rb =new LoginBean().loginValidate(email, password);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(rb!=null) {
			    hs.setAttribute("doc", rb);
				hs.setAttribute("id",  rb.getId());
				hs.setAttribute("name", rb.getName());
				hs.setAttribute("specialisation",rb.getSpecialisation());
				response.sendRedirect("./doctor_home.html?msg=login sucessfully");
			}
			else
				response.sendRedirect("./doctor_login.html?msg=login failed");

}
}