package daomodel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

	
	public List<Student> getAllStudents() {
		List<Student>student = new ArrayList<Student>();
		String query = "SELECT * FROM student";
		try {
			Connection conn = GetConnection.GetConnection();
			Statement stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery(query);
			while(res.next()) {
				Student std = new Student();
				std.setStudentid(res.getInt("studentid"));
				std.setFirstname(res.getString("firstname"));
				std.setLastname(res.getString("lastname"));
				std.setGender(res.getString("gender"));
				std.setBatchid(res.getInt("batchid"));
				std.setPaymentstatus(res.getString("paymentstatus"));
				std.setBatchname(res.getString("batchname"));
				student.add(std);
			}
			}catch (SQLException e) {
			e.printStackTrace();
		}
		return student;
		
		}
	
	public void addStudent(Student student) {
		String query1 ="INSERT INTO student Values("+student.getStudentid()+","+"'"+student.getFirstname()+"'"+
				","+"'"+student.getLastname()+"'"+","+"'"+student.getGender()+"'"+
				","+"'"+student.getBatchid()+"'"+","+"'"+student.getPaymentstatus()+
				"'"+","+"'"+student.getBatchname()+"'"+")";
		try {
			Connection conn = GetConnection.GetConnection();
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(query1);
			System.out.println("inserted successfully");
			}catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	
	public void batchStrength() {
		int count = 0;
		String query2 ="Select firstname from student where batchid=121";
		try {
			Connection conn = GetConnection.GetConnection();
			Statement stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery(query2);
			while(res.next()) {
				count+=1;
				res.getString("firstname");
			}
			System.out.println("strength of science batch is"+count);
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void getBatches() {
		String query = "Select batchname FROM student where paymentstatus ='notpaid'";
	
		try {
			Connection conn = GetConnection.GetConnection();
			Statement stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery(query);
			while(res.next()) {
				String BatchName = res.getString("batchname");
				System.out.println(BatchName);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
