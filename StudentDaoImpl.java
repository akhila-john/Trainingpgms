package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class StudentDaoImpl  implements StudentDao{

	List<Student> studentlist;
	
	public List<Student> getAllStudents() {
		
		 studentlist = new ArrayList<Student>();
		Connection conn = StudentConn.StudentConn();
		
		try {
			String query = "Select * from students";
			Statement stmt = conn.createStatement();
			ResultSet rset = stmt.executeQuery(query);
			while(rset.next()) {
			Student student = new Student();
			student.setId(rset.getInt("id"));
			student.setName(rset.getString("name"));
			student.setGender(rset.getString("gender"));
			student.setStream(rset.getString("stream"));
			student.setMark(rset.getInt("mark"));
			studentlist.add(student);
			
		}
	}catch (SQLException e) {
		e.printStackTrace();
	}
		return studentlist;
}
	
	public void addStudent(int id,String name,String gender,String stream,int mark) {
		try {
			Connection conn = StudentConn.StudentConn();
			
			Statement stmt = conn.createStatement();
			String str4 = "INSERT INTO students(id,name,gender,stream,mark)VALUES(?,?,?,?,?)";
            
			PreparedStatement statement = conn.prepareStatement(str4);
            statement.setInt(1, id);
            statement.setString(2,name);
            statement.setString(3,gender);
            statement.setString(4, stream);
            statement.setInt(5, mark);
            
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted >0) {
            	System.out.println("inserted successfully");
            }
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public int getMark(String name) {
		int result = 0;
		
		try {
			Connection conn = StudentConn.StudentConn();
            Statement stmt = conn.createStatement();
			
			String str1 ="select mark from students where name ='"+name+"'";
			
			ResultSet rs = stmt.executeQuery(str1);
			while(rs.next()) {
				result = rs.getInt("mark");
				
			}
			
		}catch (SQLException e) {
		e.printStackTrace();
	}
		
  return result;
		}
	

	public void updateStudent(int id) {
		
		try {
			Connection conn = StudentConn.StudentConn();
            Statement stmt = conn.createStatement();
            String str2 ="UPDATE students set mark=? where id=?";
            PreparedStatement statement = conn.prepareStatement(str2);
            statement.setInt(1,000 );
            statement.setInt(2, id);
            int rowsUpdated = statement.executeUpdate();
            if(rowsUpdated > 0) {
            	System.out.println("updated successfully");
            }
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
		
		
	
	public void deleteStudent(int id) {
		
		try {
			Connection conn = StudentConn.StudentConn();
			String str3 = "DELETE FROM students where id =?";
            PreparedStatement stmt = conn.prepareStatement(str3);
           stmt.setInt(1, id);
           
            int rowsDeleted = stmt.executeUpdate();
            if(rowsDeleted>0) {
           System.out.println("deleted successfully");
            }
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	

	
	
	
	

	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
}