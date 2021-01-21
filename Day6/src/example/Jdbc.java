package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class Jdbc {

	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/education","root","akhila8mysql");
			Statement stmt = conn.createStatement();
			ResultSet rset = stmt.executeQuery("SELECT * FROM students");
			System.out.println("id,name,gender,stream,mark");
			while(rset.next()) {
				int id = rset.getInt("id");
				String name = rset.getString("name");
				String gender = rset.getString("gender");
				String stream = rset.getString("stream");
				int mark = rset.getInt("mark");
				System.out.println(id+"  "+name+"   "+gender+"  "+stream+"  "+mark);
				
				}
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the name");
			String inputname =sc.next();
			String str ="select mark from students where name ='"+inputname+"'";
			
			ResultSet rs = stmt.executeQuery(str);
			if(rs.next()) {
				System.out.println(rs.getString(1));
			}else {
				System.out.println("record not found");
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
