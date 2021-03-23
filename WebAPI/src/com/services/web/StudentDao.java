package com.services.web;

import java.util.List;

import javax.ws.rs.core.Response;



public interface StudentDao {

	List<Student> getAllStudents();
	public void addStudent(Student student);
	public Student updateStudent(Student student);
	public void deleteStudent(int student_id);
}
