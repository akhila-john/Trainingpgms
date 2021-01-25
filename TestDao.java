package dao;

import java.util.List;
import java.util.Scanner;


public class TestDao {

	public static void main(String[] args) {
		
          StudentDao std = new StudentDaoImpl();
		//getallstudents
		List<Student> details = std.getAllStudents();
		
		System.out.println("id"+"  "+"name"+"   "+"gender"+"  "+"stream"+"  "+"mark");
		
		for(Student student: details) {
			System.out.println(student.getId()+"   "+student.getName()+
					"      "+student.getGender()+"       "+student.getStream()+
					"    "+student.getMark());

	}
		//add
		Student student1 = new Student();	
		student1.setId(5);
		student1.setName("akhila");
		student1.setGender("F");
		student1.setStream("commerce");
		student1.setMark(128);
		std.addStudent(student1);
		for(Student student: details) {
			System.out.println(student.getId()+"   "+student.getName()+
					"      "+student.getGender()+"       "+student.getStream()+
					"    "+student.getMark());

	}
		
		//update
		Student student = new Student();
	    student.setName("teena");
		std.updateStudent(student);
		
		
		System.out.println(student.getId()+"   "+student.getName()+
				"      "+student.getGender()+"       "+student.getStream()+
				"    "+student.getMark());
		

		//mark display
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		String name = sc.next();
		System.out.println("mark " + name+"is :" + std.getMark(name));
		
		
		
		
		//delete
		System.out.println("enter the id");
		int id = sc.nextInt();
		std.deleteStudent(id);
		for(Student student2: details) {
			System.out.println(student.getId()+"   "+student.getName()+
					"      "+student.getGender()+"       "+student.getStream()+
					"    "+student.getMark());

	}
		
	   
}
}