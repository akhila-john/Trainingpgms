package daomodel;

import java.util.Scanner;

public class TestDao {

	public static void main(String[] args) {
		
		
		//student
		StudentDao studentdao = new StudentDaoImpl();
		for(Student student:studentdao.getAllStudents()) {
			System.out.println(student);
		}
		//add student
		Student ss = new Student();
		ss.setStudentid(10);
		ss.setFirstname("akhila");
		ss.setLastname("john");
		ss.setGender("F");
		ss.setBatchid(122);
	    ss.setPaymentstatus("paid");
		ss.setBatchname("commerce");
		studentdao.addStudent(ss);
		
		//batch strength
		studentdao.batchStrength();
		
		//batch paid
		String status="notpaid";
		System.out.println("batches with students to be paid");
		studentdao.getBatches();
		
		
		//batch
		BatchDao batchdao = new BatchDaoImpl();
		for(Batch batch:batchdao.getAllBatches()) {
			System.out.println(batch);
		}
		//add new batch
		Batch bb = new Batch();
		bb.setBatchid(125);
		bb.setBatchname("visual");
		bb.setFee(1800);
		bb.setTeacherid(655);
		batchdao.addBatch(bb);
		
		//teacher
		TeacherDao teacherdao = new TeacherDaoImpl();
		for(Teacher teacher:teacherdao.getAllTeachers()) {
			System.out.println(teacher);
		}
		Teacher tt = new Teacher();
		tt.setTeacherid(658);
		tt.setName("renuka");
		tt.setDesignation("assistant prof");
		tt.setGender("F");
		tt.setAddress("kollam");
		teacherdao.addTeacher(tt);

	}

}
