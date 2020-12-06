<%@include file="connect.jsp"%>
<%
int id=Integer.parseInt(request.getParameter("id"));
String sql = "update appointment set status=? where id=?";
ps = con.prepareStatement(sql);
ps.setString(1, "Accepted");
ps.setInt(2, id);
int a = ps.executeUpdate();
if (a != 0)
	response.sendRedirect("myappointment.jsp?msg=accepted");
%>
