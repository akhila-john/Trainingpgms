package dao;

import java.util.List;

public interface StudentDao {

	public List<Student> getAllStudents();
	public int getMark(String name);
	public void updateStudent(int id);
	public void addStudent(int id,String name,String gender,String stream,int mark);
	public void deleteStudent(int id);
}
