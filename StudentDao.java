package dao;

import java.util.List;

public interface StudentDao {

	public List<Student> getAllStudents();
	public Student getStudent(int id);
	public int getMark(String name);
	public void updateStudent(Student student);
	public void addStudent(Student student);
	public void deleteStudent(int id);
}
