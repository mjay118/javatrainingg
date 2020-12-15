    package com.kims;
	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.ArrayList;
	import java.util.List;
	public class myAppointmentBean {
	int id;
	String name,email,date,time,specialisation,status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getSpecialisation() {
		return specialisation;
	}
	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<myAppointmentBean> view(int id) throws Exception {
		Connection con=ConnectionEx.Connectivity();
		PreparedStatement ps=con.prepareStatement("select name,email,date,time,specialisation,status from appointment where id=?");
		
		ps.setInt(1,id);
		ResultSet rs=ps.executeQuery();
		ArrayList<myAppointmentBean> l=new ArrayList<>();
		while(rs.next()){
			myAppointmentBean ab=new myAppointmentBean();
			ab.setName(rs.getString(1));
			ab.setEmail(rs.getString(2));
			ab.setDate(rs.getString(3));
			ab.setTime(rs.getString(4));
			ab.setSpecialisation(rs.getString(5));
			ab.setStatus(rs.getString(6));
			l.add(ab);
		}
		return l;
	}
}
