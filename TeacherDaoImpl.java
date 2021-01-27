package daomodel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TeacherDaoImpl implements TeacherDao {
	
	public List<Teacher>getAllTeachers(){
		List<Teacher>teacher = new ArrayList<Teacher>();
		String query="SELECT * FROM teacher";
		try {
			Connection conn = GetConnection.GetConnection();
			Statement stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery(query);
			while(res.next()) {
				Teacher tr = new Teacher();
				tr.setTeacherid(res.getInt("teacherid"));
				tr.setName(res.getString("name"));
				tr.setDesignation(res.getString("designation"));
				tr.setGender(res.getString("gender"));
				tr.setAddress(res.getString("address"));
				
				teacher.add(tr);
			}
			
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return teacher;
	}
	
	
	public void addTeacher(Teacher teacher) {
		String query1 = "INSERT INTO teacher VALUES("+teacher.getTeacherid()+","+"'"+teacher.getName()+"'"
		+","+"'"+teacher.getDesignation()+"'"+","+"'"+teacher.getGender()+"'"+","+"'"+teacher.getAddress()+"'"+")";
		try {
			Connection conn = GetConnection.GetConnection();
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(query1);
			System.out.println("inserted successfully");
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
