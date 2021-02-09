package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class TeacherDaoImpl implements TeacherDao{
	
	Connection conn = GetConnection.GetConnection();
	
	public List<Teacher>getAllTeachers(){
		List<Teacher>teacher = new ArrayList<Teacher>();
		String query="SELECT * FROM teacher";
		try {
			
			Statement stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery(query);
			while(res.next()) {
				Teacher tr = new Teacher();
				tr.setTeacher_id(res.getInt("teacher_id"));
				tr.setName(res.getString("name"));
				tr.setDesignation(res.getString("designation"));
				tr.setBatch_id(res.getInt("batch_id"));
				
				
				teacher.add(tr);
			}
			
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return teacher;
	}
	
	
	public void addTeacher(Teacher teacher) {
		String query1 = "INSERT INTO teacher VALUES("+teacher.getTeacher_id()+","+"'"+teacher.getName()+"'"
		+","+"'"+teacher.getDesignation()+"'"+","+"'"+teacher.getBatch_id()+"'"+")";
		try {
			
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(query1);
			System.out.println("inserted successfully");
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
