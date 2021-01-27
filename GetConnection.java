package daomodel;

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
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","akhila8mysql");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	
	
}
