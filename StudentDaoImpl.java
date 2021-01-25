package dao;

import java.sql.Connection;
import java.sql.ResultSet;
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
	}catch (Exception e) {
		e.printStackTrace();
	}
		return studentlist;
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
			
		}catch (Exception e) {
		e.printStackTrace();
	}
		
  return result;
		}
	

	public void updateStudent(Student student) {
		
		
		try {
			Connection conn = StudentConn.StudentConn();
			 String str2 ="update students set name="+"'"+student.getName()+"'"+","+"Gender="+"'"+
			student.getGender()+"'"+","+"stream="+"'"+student.getStream()+"'"+","+"mark="+"'"+student.getMark()+
			"WHERE id ="+student.getId();
            Statement stmt = conn.prepareStatement(str2);
			
            stmt.executeUpdate(str2);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteStudent(int id) {
		
		try {
			Connection conn = StudentConn.StudentConn();
			String str3 = "Delete from students where id ="+id;
            Statement stmt = conn.prepareStatement(str3);
            
             
             stmt.executeUpdate(str3);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void addStudent(Student student) {
		try {
			Connection conn = StudentConn.StudentConn();
			String str4 = "insert into student values("+student.getId()+","    +"'"+student.getName()+
					"'"+","+"'"+student.getGender()+"'"+","+"'"+student.getStream()+"'"+","+student.getMark()
					  +")";
			Statement stmt = conn.prepareStatement(str4);
            stmt.executeUpdate(str4);
            System.out.println("inserted to table stident:"+student.getName());
            
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	
	
	

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
}