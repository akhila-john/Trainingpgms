package serializationExample;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class GetValues {
	Scanner sc = new Scanner(System.in);
	
	void details() {
		
		System.out.println("enter the Firstname");
		String firstname = sc.next();
		
		
		System.out.println("enter the Password");
		String pass= sc.next();
		
		
		
	 try (ObjectInputStream objStream1 = new ObjectInputStream(
		        		 new FileInputStream("C:\\employee.txt"))) {
		 Employe obj2 = (Employe) objStream1.readObject();
		 
		 if(obj2.getFirstName().equals(firstname)) {
			 if(obj2.getPassword().equals(pass)) {
				 System.out.println(" entry successful");
			 }
			 else {
				 System.out.println("invalid password");
			 }
		 }
		 else {
			 System.out.println("invalid firstname");
		 }
		        	
		         } catch (IOException |ClassNotFoundException cnf) {
		        	 
		         }
	}
}
