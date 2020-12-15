package com.kims;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AcceptBean {
	public String status;
	public int id;
	
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
	public boolean accept(int id) throws Exception {
		Connection  con=ConnectionEx.Connectivity();
		String sql = "update appointment set status=? where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, "Accepted");
		ps.setInt(2, id);
		int a = ps.executeUpdate();
		if(a!=0)
			return true;
		else
			return false;
	}
	
}