package dao;

import java.util.List;
import java.util.Scanner;


public class TestDao {

	public static void main(String[] args) {
		
          StudentDao std = new StudentDaoImpl();
          Scanner sc = new Scanner(System.in);
		//get all students
		List<Student> details = std.getAllStudents();
		
		System.out.println("id"+"  "+"name"+"   "+"gender"+"  "+"stream"+"  "+"mark");
		
		for(Student student: details) {
			System.out.println(student.getId()+"   "+student.getName()+
					"      "+student.getGender()+"       "+student.getStream()+
					"    "+student.getMark());

	}
		//add students
		System.out.println("enter the id");
		int id = sc.nextInt();
		System.out.println("enter the name");
		String name = sc.next();
		System.out.println("enter the gender");
		String gender = sc.next();
		System.out.println("enter the stream");
		String stream = sc.next();
		System.out.println("enter the mark");
		int mark = sc.nextInt();
		std.addStudent(id, name, gender, stream, mark);
		
		//mark display
		System.out.println("enter the name");
		String name1 = sc.next();
		System.out.println("mark " + name1+"is :" + std.getMark(name1));
				
		//update
		System.out.println("enter the id");
		int id1 = sc.nextInt();
		std.updateStudent(id1);
		
		//delete
		System.out.println("enter id to be deleted");
		int id2 = sc.nextInt();
		std.deleteStudent(id2);
		
	   
}
}