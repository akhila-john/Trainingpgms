package serializationExample;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Validating {

	
	
	void details() {
		Employe obj1 = new Employe();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the firstname");
		String firstname = sc.next();
		obj1.setFirstName(firstname);
		
		System.out.println("enter the lastname");
		String lastname = sc.next();
		obj1.setLastName(lastname);
		
		System.out.println("enter the password");
		String password = sc.next();
		obj1.setPassword(password);
		
		System.out.println("enter the age");
		int age1 = sc.nextInt();
		obj1.setAge(age1);
		
		//sc.close();
		
		try (ObjectOutputStream objStream = new ObjectOutputStream(
				new FileOutputStream("C:\\employee.txt"))) {
			
			System.out.println(obj1);
			objStream.writeObject(obj1);
		}catch (IOException e) {
			
		}
		
		}
	
}
