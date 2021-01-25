package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;




public class StudentConn {

	static Connection conn = null;
	private StudentConn () {
		}
	
	public static Connection StudentConn() {
		try {
			if(conn==null)  {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/education","root","akhila8mysql");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
}

