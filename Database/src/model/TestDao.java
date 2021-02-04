package model;

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
						ss.setStudent_id(id);
						System.out.println("enter the firstname");
						String firstname =sc.next();
						ss.setFirst_name(firstname);
						System.out.println("enter the lastname");
						String lastname = sc.next();
						ss.setLast_name(lastname);
						System.out.println("enter the batchid");
						int batchid = sc.nextInt();
						ss.setBatch_id(batchid);
						System.out.println("enter the gender");
						String gender = sc.next();
						ss.setGender(gender);
						
						Fee ff = new Fee();
						System.out.println("enter the paymentid");
						int id2 = sc.nextInt();
						ff.setPayment_id(id2);
						System.out.println("enter the studentid");
						int id3 = sc.nextInt();
						ff.setStudent_id(id3);
						System.out.println("enter the paymentamount");
						int amount = sc.nextInt();
						ff.setPayment_amount(amount);
						System.out.println("enter the payment status");
						String status1 = sc.next();
						ff.setPayment_status(status1);
						studentdao.addStudent(ss,ff);
						break;
					    
				
					case 2:
						studentdao.batchStrength();
						break;
						
					case 3:
						String status="notpaid";
						System.out.println("batches with students to be paid");
						studentdao.getBatches();
						break;	
						
						
					case 4:
						for(Fee fee:feedao.getAllFees()) {
							System.out.println(fee);
						}
						
						break;
					
					case 5:
						for(Teacher teacher:teacherdao.getAllTeachers()) {
						System.out.println(teacher);
						}
						Teacher tt = new Teacher();
						System.out.println("enter the teacherid");
						int id1 = sc.nextInt();
						tt.setTeacher_id(id1);
						System.out.println("enter the teachername");
						String name1 = sc.next();
						tt.setName(name1);
						System.out.println("enter the designation");
						String des = sc.next();
						tt.setDesignation(des);
						System.out.println("enter the batchid");
						int batchid1 = sc.nextInt();
						tt.setBatch_id(batchid1 );
						
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
						bb.setBatch_id(batchidd);
						System.out.println("enter the batchname");
						String batchnamee = sc.next();
						bb.setBatch_name(batchnamee);
						System.out.println("enter the fee");
						int fees = sc.nextInt();
						bb.setFee(fees);
						
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
