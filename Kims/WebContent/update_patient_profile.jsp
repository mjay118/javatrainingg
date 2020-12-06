<!DOCTYPE html>
<html>

<body bgcolor="wheat">
<br><br><br>
<center><h1>UPDATE YOUR PROFILE DETAILS</h1></center>
<br><br><br>
<center>
<a href="patient_home.html">Home</a>
<a href="patient_profile.jsp">Profile</a>
<a href="index.html">LogOut</a>
</center>
<br><br><br>
<%@ page import="java.sql.*" %>
<%@ include file="connect.jsp" %>
<%
int id=Integer.parseInt(request.getParameter("id"));
ps=con.prepareStatement("select * from patient where id=?");
ps.setInt(1,id);
ResultSet rs=ps.executeQuery();
if(rs.next()){
%>

<form action="./patient_profile_update.jsp" align="center">
<input type="hidden" name="id" value="<%=rs.getInt("id") %>"><br><br>
<input type="text" name="name" value="<%=rs.getString("name") %>"><br><br>
<input type="email" name="email" value="<%=rs.getString("email") %>"><br><br>
<input type="number" name="phone" value="<%=rs.getInt("phone") %>"><br><br>


</select><br><br>


<input type="submit" value="update">



</form>
<%}%>