package com.kims;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DoctorUpdateBean {
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
	
	public RegistrationBean update(String name, String email, String password, long phone,  String specialisation) throws Exception {
		Connection con=ConnectionEx.Connectivity();
		String sql="update doctor set name=?, email=?, password=?,phone=?,specialisation=? where id=? ";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, password);
		ps.setLong(4, phone);
		ps.setString(5,specialisation);
		ps.setInt(6,id);
		int x=ps.executeUpdate();
		RegistrationBean rb = new RegistrationBean();
		if (x != 0) {
			sql = "select * from doctor where id=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				rb.setId(rs.getInt("id"));
				rb.setName(rs.getString("name"));
				rb.setEmail(rs.getString("email"));
				rb.setPassword(rs.getString("password"));
				rb.setPhone(rs.getInt("phone"));
				rb.setSpecialisation(rs.getString("specialisation"));
				return rb;
			}else {
				return null;
			}
		} else
			return null;
	}
	 
}
