package serializationExample;

import java.util.Scanner;

public class Validation {

	String name="akhila" ;
	int pin = 123;
	UsernameAndPin uap = new UsernameAndPin();
	
	void input() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the username");
		String username = sc.next();
		uap.setUserName(username);
		
		System.out.println("enter the pin");
		int userpin = sc.nextInt();
		uap.setUserPin(userpin);
		sc.close();
	}
	
	void validation() {
		if (name.equals(uap.getUserName()) ) {
			if (pin==uap.getUserPin()) {
				System.out.println("valid details");
			} else {
				System.out.println("invalid pin");
			}
			
		}else {
			System.out.println("invalid username");
		}
		
	}
}
