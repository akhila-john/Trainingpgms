package exceptionexamples;

import java.util.Scanner;

public class CheckUsernamePasswordExample {
    static String username = "infy";
    static String password = "mys";
    static String username1;
    static String password1;
	
	
	static Scanner sc = new Scanner(System.in);
	static void getData() {

		System.out.println("enter the username");
		username1 = sc.next();
		System.out.println("enter the password");
		password1 = sc.next();
		sc.close();
	}
	static void validateUser() throws UsernamePasswordCorrect,PasswordWrongException,UsernameWrongException {
		if(username.equals(username1)) {
			if (password.equals(password1))  {
			throw new UsernamePasswordCorrect(" username and password is correct");
		}
			else  {
			throw new PasswordWrongException("password is incorrect");
			}
			} else {
			throw new UsernameWrongException("wrong useame");
		}
	}
}

