<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<center><h1>Update DOCTOR</h1></center><br><br>
<center>

<a href="doctor_home.html">Home</a>
<a href="doctor_profile.jsp">Profile</a>
<a href="index.html">LogOut</a>
<a href="myappointment.jsp">my Appointment</a>
</center>
<br><br><br>
<%@page import="com.kims.RegistrationBean" %>
<%
RegistrationBean rb=(RegistrationBean)session.getAttribute("doc");
if(rb!=null){
%>

<form action="./doctor_profile_update" align="center" method="post">
<input type="hidden" name="id" value="<%=rb.getId() %>"><br><br>
<input type="text" name="name" value="<%=rb.getName() %>"><br><br>
<input type="email" name="email" value="<%=rb.getEmail() %>"><br><br>

<input type="number" name="phone" value="<%=rb.getPhone() %>"><br><br>
<select name="specialisation" ><br><br>
<option value="<%=rb.getSpecialisation()%>"><%=rb.getSpecialisation()%></option>
<option value="DENTIST">DENTISTS</option>
<option value="ENT">ENT</option>
<option value="DERMATOLOGIST">DERMATOLOGIST</option>
<option value="MEDICINE">MEDICINE</option>
<option value="CARDIOLOGIST">CARDIOLOGIST</option>
<option value="SURGEON">SURGEON</option>
<option value="NEUROLOGISTS">NEUROLOGISTS</option>
<option value="PSYCHIATARIST">PSYCHIATARIST</option>
<option value="ORTHOPAEDIC">ORTHOPAEDIC</option>

</select><br><br>


<input type="submit" value="update">



</form>

<%
		}
	%>
	
</body>
</html>