package model;

import java.util.List;
import java.util.Scanner;

public class DaoPattern {

	public static void main(String[] args) {
		StudentDao std = new StudentDaoImpl();
		
		List<Student> details = std.getStudents();
		
		System.out.println("id"+"  "+"name"+"   "+"gender"+"  "+"stream"+"  "+"mark");
		
		for(Student student: details) {
			System.out.println(student.getId()+"   "+student.getName()+
					"      "+student.getGender()+"       "+student.getStream()+
					"    "+student.getMark());
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		String name = sc.next();
		System.out.println("mark " + name+"is :" + std.getMark(name));
		
	}

}
