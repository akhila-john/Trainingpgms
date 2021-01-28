package daomodel;

import java.util.List;

public interface StudentDao {

	List<Student>getAllStudents();
	public void addStudent(Student student);
	
	public void batchStrength();
	public void getBatches();
}
