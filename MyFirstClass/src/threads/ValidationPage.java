package threads;

import java.util.Scanner;

public class ValidationPage {

	 void adminLogin() {
			
			String validUsername="quest";
			String validPassword= "global";
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("enter the AdminName");
			String username1=sc.next();
			System.out.println("enter the AdminPassword");
			String password1=sc.next();
			
			if ((validUsername.equals(username1))) {
					if((validPassword.equals(password1))) {
				System.out.println("Admin login successful");
					}else {
				MainPage.mainPage()
			} 
			menuOptions();
	 }
			else {
				 mainPage();
			}
	  
	 }//end of admin
	 
}
