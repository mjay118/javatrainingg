package com.kims;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegistrationBean {
 private String name,email,password,specialisation;
 private int id;
 private long phone;
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
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getSpecialisation() {
	return specialisation;
}
public void setSpecialisation(String specialisation) {
	this.specialisation = specialisation;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
} 
public boolean register(String name, String email, String password, long phone,  String specialisation) throws Exception {
	Connection con=ConnectionEx.Connectivity();
	String sql="insert into doctor(name,email,password,phone,specialisation) values(?,?,?,?,?)";
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setString(1, name);
	ps.setString(2, email);
	ps.setString(3, password);
	ps.setLong(4, phone);
	ps.setString(5,specialisation);
	
	int x=ps.executeUpdate();
	if(x!=0)
		return true;
	else
		return false;
}
}
