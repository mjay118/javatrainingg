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
<%@page import="com.kims.RegistrationBean" %>
<center><table border=1 width=20% height=20%>
<tr><td>Name</td><td>Email</td><td>Phone</td><td>Specialisation</td><td>Action</td></tr>
<%
RegistrationBean rb=(RegistrationBean)session.getAttribute("doc");
%>
<tr>
<td><%=rb.getName()%></td>
<td><%=rb.getEmail()%></td>
<td><%=rb.getPhone()%></td>
<td><%=rb.getSpecialisation() %></td>
<td><a href="update_doctor_profile.jsp?id=<%=rb.getId()%>">Update</a></td>
</tr>
</table>
</center>

</body>
</html>