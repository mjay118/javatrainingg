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
<%@page import="com.kims.myAppointmentBean,java.util.*" %>
<center><table border=1 width=20% height=20%>
<tr><td>Name</td><td>Email</td><td>Date</td><td>Time</td><td>Specialisation</td><td>Status</td><td>Action</td></tr>
<%
int id=(Integer)session.getAttribute("id");
List <myAppointmentBean> l = new myAppointmentBean().view(id);
Iterator i=l.iterator();
 while(i.hasNext()){
myAppointmentBean mab=(myAppointmentBean)i.next();
%>
<tr>
			<td><%=mab.getName() %></td>
			<td><%=mab.getEmail() %></td>
			<td><%=mab.getDate() %></td>
			<td><%=mab.getTime() %></td>
			<td><%=mab.getSpecialisation() %></td>
			<%if(mab.getStatus().equalsIgnoreCase("Accepted")){ %>
			<td>Accepted</td>
			<%}else{ %>
			<td><form action="./accept_appointment" method="post"><input type="hidden" name="id" value="<%=mab.getId()%>"> 
			<input type="submit" value="accept">
			</form></td>
			<%} %>
		</tr>
<%} %>
</table>
</body>
</html>
