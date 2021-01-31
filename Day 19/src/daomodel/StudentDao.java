package daomodel;

import java.util.List;

public interface StudentDao {

	List<Student>getAllStudents();
	public void addStudent(Student student,Fee fee);
	
	public void batchStrength();
	
}
