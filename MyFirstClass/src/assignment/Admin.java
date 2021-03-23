package assignment;

import java.util.Scanner;

public class Admin {
        
	public static void main(String[] args) {
		String validUsername="quest";
		String validPassword= "global";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the username");
		String username1=sc.next();
		System.out.println("enter the password");
		String password1=sc.next();
		sc.close();
		if ((validUsername.equals(username1))&&(validPassword.equals(password1))) {
			System.out.println("admin login successful");
			
		}else {
			System.out.println("admin login unsuccessful");
		}
	}
}
