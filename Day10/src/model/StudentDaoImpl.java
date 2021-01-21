package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class StudentDaoImpl implements StudentDao {
     
	public List<Student> getStudents(){
     
		List<Student> studentlist = new ArrayList<Student>();
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/education","root","akhila8mysql");
			Statement stmt = conn.createStatement();
			ResultSet rset = stmt.executeQuery("select * from students");
			
			
			while(rset.next()) {
				Student student = new Student();
				student.setId(rset.getInt("id"));
				student.setName(rset.getString("name"));
				student.setGender(rset.getString("gender"));
				student.setStream(rset.getString("stream"));
				student.setMark(rset.getInt("mark"));
				studentlist.add(student);
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return studentlist;
	}
	
	public int getMark(String name) {
		int result = 0;
		try {
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/education","root","akhila8mysql");
		Statement stmt = conn.createStatement();
			
			String str ="select mark from students where name ='"+name+"'";
			
			ResultSet rs = stmt.executeQuery(str);
			while(rs.next()) {
				result = rs.getInt("mark");
			}
			
			
	}catch (Exception e) {
		e.printStackTrace();
	}
		
  return result;
	
}

	
}