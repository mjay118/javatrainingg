package com.kims;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PatientLoginBean {

	private String email,password;

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
	
	public PatientRegistrationBean loginValidate(String email, String password) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEx.Connectivity();
	
		PreparedStatement ps=con.prepareStatement("select * from patient where email=? and password=?");
		ps.setString(1, email);
		ps.setString(2, password);
		ResultSet rs=ps.executeQuery();
		PatientRegistrationBean prb=new PatientRegistrationBean();
		if(rs.next()) {
			prb.setId(rs.getInt("id"));
			prb.setName(rs.getString("name"));
			prb.setEmail(rs.getString("email"));
			prb.setPassword(rs.getString("password"));
			prb.setPhone(rs.getInt("phone"));
			return prb;
		}else {
			return null;
		}
	}
}