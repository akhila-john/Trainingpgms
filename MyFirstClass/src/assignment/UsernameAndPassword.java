package assignment;

import java.util.Scanner;

public class UsernameAndPassword {

	static String username = "akhilajohn";
    static String password = "akhilajo";
    static String username1;
    static String password1;
	
	
	static Scanner sc = new Scanner(System.in);
	static void getDetails()throws UserLength,PasswordLength {

		System.out.println("enter the username");
		username1 = sc.next();
		if (username1.length()<6| username1.length()>10)
		{
			throw new UserLength("correct the length");
		}
		
		System.out.println("enter the password");
		password1 = sc.next();
		if (password1.length()<6 | password1.length()>8)
		{
			throw new PasswordLength("correct the length");
		}
		
sc.close();

	
		
		
	}
}