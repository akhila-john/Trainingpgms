package model;

import java.sql.SQLException;
import java.util.List;



public interface StudentDao {

	List<Student>getAllStudents();
	public void addStudent(Student student,Fee fee) throws SQLException ;
	
	public void batchStrength();
	public void getBatches();
}
