package daomodel;

import java.util.Scanner;

public class TestDao {

	public static void main(String[] args) {
		
		
		//student
		StudentDao studentdao = new StudentDaoImpl();
		BatchDao batchdao = new BatchDaoImpl();
		TeacherDao teacherdao = new TeacherDaoImpl();
        FeeDao feedao = new FeeDaoImpl();
		Scanner sc = new Scanner(System.in);
		String repeat;
		System.out.println("enter your choice");
		System.out.println("1.student details"+"\n"+"2.batch strength"+"\n"+"3.batch paid"+"\n"+"4.fee details"+"\n"+"5.teacher details"+"\n"+"6.Batch details");
		int c = sc.nextInt();
		do {
		switch(c) {
		
		case 1:
		for(Student student:studentdao.getAllStudents()) {
			System.out.println(student);
		}
		Student ss = new Student();
		System.out.println("enter the id");
		int id =sc.nextInt();
		ss.setStudentid(id);
		System.out.println("enter the firstname");
		String firstname =sc.next();
		ss.setFirstname(firstname);
		System.out.println("enter the lastname");
		String lastname = sc.next();
		ss.setLastname(lastname);
		System.out.println("enter the gender");
		String gender = sc.next();
		ss.setGender(gender);
		System.out.println("enter the batchid");
		int batchid = sc.nextInt();
		ss.setBatchid(batchid);
		
	    System.out.println("eneter the batchname");
	    String batchname = sc.next();
		ss.setBatchname(batchname);
		//studentdao.addStudent(ss);
		Fee ff = new Fee();
		System.out.println("enter the paymentid");
		int id2 = sc.nextInt();
		ff.setPaymentid(id2);
		System.out.println("enter the studentid");
		int id3 = sc.nextInt();
		ff.setStudentid(id3);
		System.out.println("enter the batchname");
		String course = sc.next();
		ff.setBatchname(course);
		System.out.println("enter the payment status");
		String status1 = sc.next();
		ff.setPaymentstatus(status1);
		studentdao.addStudent(ss,ff);
		break;
		
		case 2:
		studentdao.batchStrength();
		break;
		
		//batch paid
		case 3:
		String status="notpaid";
		System.out.println("batches with students to be paid");
		feedao.getBatches();
		break;
		
		case 4:
			Fee f = new Fee();
			System.out.println("enter the paymentid");
			int id4 = sc.nextInt();
			f.setPaymentid(id4);
			System.out.println("enter the studentid");
			int id5 = sc.nextInt();
			f.setStudentid(id5);
			System.out.println("enter the batchname");
			String course1 = sc.next();
			f.setBatchname(course1);
			System.out.println("enter the payment status");
			String status2 = sc.next();
			f.setPaymentstatus(status2);
			feedao.addFee(f);
			break;
		//teacher
		case 5:
		for(Teacher teacher:teacherdao.getAllTeachers()) {
		System.out.println(teacher);
		}
		Teacher tt = new Teacher();
		System.out.println("enter the teacherid");
		int id1 = sc.nextInt();
		tt.setTeacherid(id1);
		System.out.println("enter the teachername");
		String name1 = sc.next();
		tt.setName(name1);
		System.out.println("enter the designation");
		String des = sc.next();
		tt.setDesignation(des);
		System.out.println("enter the gender");
		String genderr = sc.next();
		tt.setGender(genderr);
		System.out.println("enter the address");
		String add = sc.next();
		tt.setAddress(add);
		teacherdao.addTeacher(tt);
        break;
        
		case 6:
			for(Batch batch:batchdao.getAllBatches()) {
				System.out.println(batch);
			}
			//add new batch
			Batch bb = new Batch();
			System.out.println("enter the batchid");
			int batchidd = sc.nextInt();
			bb.setBatchid(batchidd);
			System.out.println("enter the batchname");
			String batchnamee = sc.next();
			bb.setBatchname(batchnamee);
			System.out.println("enter the fee");
			int fees = sc.nextInt();
			bb.setFee(fees);
			System.out.println("enter the teacherid");
			int idd = sc.nextInt();
			bb.setTeacherid(idd);
			batchdao.addBatch(bb);
			break;
        
        default:
        	System.out.println("invalid choice");
	}
		System.out.println("do you want to continue?:Y/N");
		repeat = sc.next();
		}while(!("N".equalsIgnoreCase(repeat)));
		sc.close();
		
	}		
}
