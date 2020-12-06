
<!DOCTYPE html>
<html>

<body bgcolor="wheat">
<br><br><br>
<center><h1>YOUR PROFILE DETAILS</h1></center>
<br><br><br>
<center>
<a href="doctor_home.html">Home</a>
<a href="doctor_profile.jsp">Profile</a>
<a href="index.html">LogOut</a>
</center>
<br><br><br>
<%@ page import="java.sql.*" %>
<center><table border=1 width=20% height=20%>
<tr><td>Name</td><td>Email</td><td>Date</td><td>Time</td><td>Status</td><td>Action</td></tr>
<%
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/kims";
String uname = "root";
String pass = "1234";
con = DriverManager.getConnection(url, uname, pass);
int id=(Integer)session.getAttribute("id");
ps=con.prepareStatement("select * from appointment where id=?");
ps.setInt(1, id);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getString("name") %></td>
<td><%=rs.getString("email") %></td>
<td><%=rs.getString("date") %></td>
<td><%=rs.getString("time") %></td>
<td><%=rs.getString(7) %></td>
<td><a href="accept_appointment.jsp?id=<%=rs.getInt(1)%>">Accept</a></td>
</tr>
<%} %>
</table>
</center>
</body>
</html>