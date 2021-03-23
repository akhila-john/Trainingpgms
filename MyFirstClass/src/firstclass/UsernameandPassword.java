package firstclass;

import java.util.Scanner;

public class UsernameandPassword {

	public static void main(String[] args) {
		String validUsername="Quest";
		String validPassword="Global";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Usernsme");
		String username1=sc.next();
		System.out.println("Enter the Password");
		String password1=sc.next();
		sc.close();
		if(validUsername.equals(username1)) {
			if(validPassword.equals(password1)){
				System.out.println("Valid Password");
			}
		}
		else {
			System.out.println("Invalid Password");
			}
	
		
	}	//End of main method
		

} //End of main class
