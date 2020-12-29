<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="SteelBlue">
<center><h2 style="color:white;">WELCOME TO PATIENT PROFILE PAGE</h2></center>
<br><br><center>
<a style="color:yellow;" href="view_test_appointments.jsp">View Test Appointments</a> |
<a style="color:yellow;" href="index.html">Log-Out</a><br><br><br><br><br><br><br>
</center>
<%@page import="com.pojo.Patient,com.main.PatientBean,java.util.*" %>
<table border="2" align="center" width="600" height="100" cellpadding="20">
<tr>
<td style="color:yellow;">Patient Id</td>
<td style="color:yellow;">Name</td>

<td style="color:yellow;">D.O.B</td>
<td style="color:yellow;">Email</td>
<td style="color:yellow;">Phone</td>
<td style="color:yellow;">Address</td>

</tr>
<%
int id=(Integer)session.getAttribute("patient_id");
List<Patient> pa=PatientBean.getById(id);
Iterator<Patient> i=pa.iterator();
while(i.hasNext())
{
 	Patient pt=i.next();
 	%>
	<tr>
		<td style="color:white;"><%=pt.getPatient_id() %></td>
		<td style="color:white;"><%=pt.getPatient_name() %></td>
		
		<td style="color:white;"><%=pt.getDate_of_birth() %></td>
		<td style="color:white;"><%=pt.getPatient_email() %></td>
		<td style="color:white;"><%=pt.getPatient_phone() %></td>
		<td style="color:white;"><%=pt.getPatient_address() %></td>
		
	</tr></table>
	<br><br><br>
	<a style="color:white;" href="update_patient_profile.jsp? id=<%=pt.getPatient_id() %>"><center>update profile</center></a>	
<% } %>
</body>
</html>