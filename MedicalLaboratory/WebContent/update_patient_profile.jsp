<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="SteelBlue">
<center><h2 style="color:white;">WELCOME TO PATIENT PROFILE PAGE</h2></center>
<br><br><center>
<a style="color:yellow;" href="patient_home.jsp">Pathologist Home</a> |
<a style="color:yellow;" href="index.html">Log-Out</a>
<br><br><br>
</center>
<%@page import="com.pojo.Patient,com.main.PatientBean,java.util.*" %>
<%
int id=(Integer)session.getAttribute("patient_id");
List<Patient> pa=PatientBean.getById(id);
Iterator<Patient> i=pa.iterator();
while(i.hasNext())
{
 	Patient pt=i.next();
 	%>
<form action="./update_patient_profile" method= "post" align ="center">
<br>
<input type="hidden" name="patient_id" value="<%=pt.getPatient_id() %>">
<label  style="color:white;"><i>Enter Name:</i></label>
<input type="text" name="patient_name" value="<%=pt.getPatient_name() %>"><br><br>


<label  style="color:white;"><i>Enter Date Of Birth:</i></label>
<input type="date" name="d_o_b" value="<%=pt.getDate_of_birth() %>"><br><br>
<label  style="color:white;"><i>Enter Email Id:</i></label>
<input type="email" name="patient_email" value="<%=pt.getPatient_email() %>"><br><br>
<input type="hidden" name="patient_password" value="<%=pt.getPatient_password() %>"><br><br>
<label  style="color:white;"><i>Enter Phone No.:</i></label>
<input type="number" name="patient_phone" value="<%=pt.getPatient_phone() %>"><br><br>
<label  style="color:white;"><i>Enter Your Address:</i></label>
<input type="text" name="patient_address" value="<%=pt.getPatient_address() %>"><br><br>
<input style="color:green;"type="submit" value="Update">
</form>
<%} %>
</form>
</body>
</html>