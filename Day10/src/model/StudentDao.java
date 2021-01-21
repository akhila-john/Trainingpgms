package model;

import java.util.List;

public interface StudentDao {

	public List<Student> getStudents();
	//public  getStudent();
	public int getMark(String name);
}
