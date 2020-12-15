package com.kims;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AppointmentBean {
int id;
String name,email,date,time,specialisation,status;
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
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
public boolean apply(int id,String name,String email,String date,String time, String specialisation) throws Exception {
		Connection con=ConnectionEx.Connectivity();
		String sql = "insert into appointment(id,name,email,date,time,specialisation) values(?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, email);
		ps.setString(4, date);
		ps.setString(5, time);
		ps.setString(6, specialisation);
		int a = ps.executeUpdate();
		if (a != 0)
			return true;
		else
			return false;
	}
	
	public List<AppointmentBean> status(int id) throws Exception {
		Connection con=ConnectionEx.Connectivity();
		PreparedStatement ps=con.prepareStatement("select * from appointment where id=?");
		ps.setInt(1,id);
		ResultSet rs=ps.executeQuery();
		ArrayList<AppointmentBean> l=new ArrayList<>();
		while(rs.next()){
			AppointmentBean ab=new AppointmentBean();
			ab.setName(rs.getString(2));
			ab.setEmail(rs.getString(3));
			ab.setDate(rs.getString(4));
			ab.setTime(rs.getString(5));
			ab.setSpecialisation(rs.getString(6));
			ab.setStatus(rs.getString(7));
			l.add(ab);
		}
		return l;
	}
}
