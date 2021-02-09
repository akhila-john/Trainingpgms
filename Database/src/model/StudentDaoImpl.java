package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

	Connection conn = GetConnection.GetConnection();
	
	public List<Student> getAllStudents() {
		List<Student>student = new ArrayList<Student>();
		String query = "SELECT * FROM student";
		try {
			
			Statement stmt3 = conn.createStatement();
			ResultSet res = stmt3.executeQuery(query);
			while(res.next()) {
				Student std = new Student();
				std.setStudent_id(res.getInt("student_id"));
				std.setFirst_name(res.getString("first_name"));
				std.setLast_name(res.getString("last_name"));
				
				std.setBatch_id(res.getInt("batch_id"));
				std.setGender(res.getString("gender"));
				
				student.add(std);
			}
			}catch (SQLException e) {
			e.printStackTrace();
		}
		return student;
		
		}
	
	
	public void addStudent(Student student,Fee fee) throws SQLException  {
		
		try {
			//(Connection conn = GetConnection.GetConnection())
			conn.setAutoCommit(false);
			
			String query1 ="INSERT INTO student VALUES("+student.getStudent_id()+","+"'"+student.getFirst_name()+"'"+
					","+"'"+student.getLast_name()+"'"+","+"'"+student.getBatch_id()+"'"+
					","+"'"+student.getGender()+"'"+")";
			
			String query2 ="INSERT INTO fee_details VALUES("+fee.getPayment_id()+","+"'"+fee.getStudent_id()+"'"+","+"'"+
				      fee.getPayment_amount()+"'"+","+"'"+fee.getPayment_status()+"'"+")";
		
			try (Statement stmt = conn.createStatement()) {
			
			PreparedStatement stmt1 = conn.prepareStatement(query1 );
			PreparedStatement stmt2 = conn.prepareStatement(query2);
			stmt1.executeUpdate();
			stmt2.executeUpdate();
			conn.commit();
			//System.out.println("inserted successfully");
		}catch (SQLException e) {
				conn.rollback();
				throw e;
			//e.printStackTrace();
			}
			
		}catch (SQLException e1) {
			e1.printStackTrace();
		}
		}
	
	public void batchStrength() {
		int result = 0;
		String query2 ="Select first_name from student where batch_id=100";
		try {
			//Connection conn = GetConnection.GetConnection();
			Statement stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery(query2);
			while(res.next()) {
				result+=1;
				res.getString("first_name");
			}
			System.out.println("strength of science batch is"+result);
		}catch (SQLException e) {
			e.printStackTrace();
		}
	
	
}
	public void getBatches() {
		String query ="Select student.first_name,fee_details.payment_status,batch_details.batch_name from (student join fee_details on student.student_id = fee_details.student_id) join batch_details on student.batch_id=batch_details.batch_id where fee_details.payment_status='notpaid';";
				
		try {
			//Connection conn = GetConnection.GetConnection();
			Statement stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery(query);
			while(res.next()) {
				System.out.println(res.getString("batch_name"));
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		}
}