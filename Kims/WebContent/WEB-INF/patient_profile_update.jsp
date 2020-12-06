<%@ page import="java.sql.*" %>
<%@ include file="connect.jsp" %>
<%
int id=Integer.parseInt(request.getParameter("id"));
String name=request.getParameter("name");
String email=request.getParameter("email");

int phone=Integer.parseInt(request.getParameter("phone"));

ps=con.prepareStatement("update patient set name=?, email=?, phone=? where id=? ");
ps.setString(1,name);
ps.setString(2,email);
ps.setLong(3,phone);
ps.setInt(4,id);
int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("patient_profile.jsp?msg=Updated");
%>