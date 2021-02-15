 package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetConnection {

	static Connection conn = null;
	
	private GetConnection()  {
		
	}
	
	public static Connection GetConnection() {
		try {
			if(conn==null)  {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/institution","root","akhila8mysql");
				conn.setAutoCommit(false);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
}
}