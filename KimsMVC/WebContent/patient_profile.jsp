<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<center><h1>WELCOME DOCTOR</h1></center><br><br>
<center>

<a href="doctor_home.html">Home</a>
<a href="doctor_profile.jsp">Profile</a>
<a href="index.html">LogOut</a>
<a href="myappointment.jsp">my Appointment</a>
</center>
<br><br><br>
<%@page import="com.kims.PatientRegistrationBean" %>
<center><table border=1 width=20% height=20%>
<tr><td>Name</td><td>Email</td><td>Phone</td><td>Action</td></tr>
<%
PatientRegistrationBean prb=(PatientRegistrationBean)session.getAttribute("patient");
%>
<tr>
<td><%=prb.getName()%></td>
<td><%=prb.getEmail()%></td>
<td><%=prb.getPhone()%></td>

<td><a href="update_patient_profile.jsp?id=<%=prb.getId()%>">Update</a></td>
</tr>
</table>
</center>

</body>
</html>