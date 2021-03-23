package collections;

import java.util.Scanner;

public class UserLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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


