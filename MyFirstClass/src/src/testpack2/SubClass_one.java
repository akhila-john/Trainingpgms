package src.testpack2;
import java.util.Scanner;


import src.testpack1.Superclass_one;
public class SubClass_one extends Superclass_one {
     String username;
    String password;
      
    
    
	SubClass_one(String username , String password)  {
		super(username ,password);
	}
	
	void validate()  {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Usernsme");
		String username=sc.next();
		System.out.println("Enter the Password");
	    String password=sc.next();
	    Validateuser(username,password);
		sc.close();
		
	}
}
