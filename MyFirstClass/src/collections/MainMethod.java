package collections;

import java.util.Scanner;

public class MainMethod {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
       void admin() {
		
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
				mainpage();
			}
	}
       
       void userlogin() {
    	   String validUsername1="Akhila";
			String validPassword1= "John";
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the username");
			String username2=sc.next();
			System.out.println("enter the password");
			String password2=sc.next();
			sc.close();
			if ((validUsername1.equals(username2))&&(validPassword1.equals(password2))) {
				System.out.println("user login successful");
				
			}else {
				System.out.println("user login unsuccessful");
			}
       }

}
