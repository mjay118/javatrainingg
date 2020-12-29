package com.main;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.BloodTest;
import com.pojo.UrineTest;

public class ApplyTest extends HttpServlet {

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		
		String pname=request.getParameter("pname");
		String pgender=request.getParameter("pgender");
		String pemail=request.getParameter("pemail");
		String phone=request.getParameter("phone");
		String age=request.getParameter("age");
		String blood_group=request.getParameter("blood_group");
		String test_name=request.getParameter("test_name");
		String referred_by_doc=request.getParameter("referred_by_doc");
		String referred_by_hospital=request.getParameter("referred_by_hospital");
		String date_and_time=request.getParameter("date_and_time");
		
		boolean apply_status=false;

		if(test_name.equals("BLOOD TEST"))
		{
			BloodTest bt=new BloodTest();
			
			bt.setPname(request.getParameter("pname"));		
			bt.setPgender(request.getParameter("pgender"));
			bt.setPemail(request.getParameter("pemail"));
			bt.setPhone(request.getParameter("phone"));
			bt.setAge(Integer.parseInt(request.getParameter("age")));
			bt.setBlood_group(request.getParameter("blood_group"));
			bt.setTest_name(request.getParameter("test_name"));
			bt.setReferred_by_doc(request.getParameter("referred_by_doc"));
			bt.setReferred_by_hospital(request.getParameter("referred_by_hospital"));
			apply_status=ApplyTestBean.apply(bt); 
				
			if(apply_status) {
				response.sendRedirect("./patient_home.jsp?msg=test applied sucessfully");
			}
			else
				response.sendRedirect("./test_apply.html?msg=test apply failed");
		
					
		}
		else if(test_name.equals("urine_test"))
		{
			UrineTest ut=new UrineTest();
			
			ut.setPname(request.getParameter("pname"));		
			ut.setPgender(request.getParameter("pgender"));
			ut.setPemail(request.getParameter("pemail"));
			ut.setPhone(request.getParameter("phone"));
			ut.setAge(Integer.parseInt(request.getParameter("age")));
			ut.setBlood_group(request.getParameter("blood_group"));
			ut.setTest_name(request.getParameter("test_name"));
			ut.setReferred_by_doc(request.getParameter("referred_by_doc"));
			ut.setReferred_by_hospital(request.getParameter("referred_by_hospital"));
			apply_status=ApplyTestBean.apply(ut); 
			if(apply_status) {
				response.sendRedirect("./patient_home.jsp?msg=test applied sucessfully");
			}
			else
				response.sendRedirect("./test_apply.html.jsp?msg=test apply failed");
		
		}
	}
}