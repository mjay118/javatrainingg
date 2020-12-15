package com.kims;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEx {

	public static Connection Connectivity() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/kims";
		String uname = "root";
		String pass = "1234";
		Connection con = DriverManager.getConnection(url, uname, pass);
		return con;
	}
}
