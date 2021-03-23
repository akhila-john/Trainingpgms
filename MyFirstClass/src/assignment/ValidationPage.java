package assignment;

import java.util.Scanner;

public class ValidationPage {
	
	static String validUsername="quest";
	static String validPassword= "global";
static void adminLogin() {  
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("enter the AdminUsername");
			String username1=sc.next();//getting the username from user
			
			if ((validUsername.equals(username1))) {
				System.out.println("enter the AdminUserpassword");
				String password1=sc.next();//geting the password from user
				
					if((validPassword.equals(password1))) {
				     System.out.println("Admininistrator login successful");
				     DisplayPage.menuOptions();//returs to the menuoptions
					}else {
				    System.out.println("wrong adminpasswd ");
				    MainPage.mainPage();//returns to mainpage
				}//end of inner if
			}//end of if
			else {
				 System.out.println("wrong adminusername");
				 MainPage.mainPage();//returns to mainpage
			}//end of outer else
	  sc.close();
	 }//end of adminLogin
	 
	
	static String validUsername1="Akhila";
	static String validPassword1= "John";
	static void userLogin() {
  	        Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("enter the Username");
			String username2=sc.next();//getting the username from admin
			
			
			if ((validUsername1.equals(username2))) {
				System.out.println("enter the Password");
				String password2=sc.next();//getting the password from admin
				
				if((validPassword1.equals(password2))) {
				System.out.println("user login successful");
				MainPage.mainPage();//retuns to the mainpage
				}else {
				System.out.println("wrong password");
				MainPage.mainPage();//returns to the mainpage
			     }//end of inner if
			}//end of outer if 
			else {
				System.out.println("wrong username");
				MainPage.mainPage();//returns to the mainpage
			}//end of outer else
		sc.close();	 
     }//end of userlogin
	
}//end of validationpage
