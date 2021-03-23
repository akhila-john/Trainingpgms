package assignment;

import java.util.Scanner;

public class MainPage {
	static void mainPage() {
		Scanner sc= new Scanner(System.in);
		System.out.println("1 Admin Login");
		System.out.println("2 User Login");
		System.out.println("3 Exit");
		System.out.println();
		System.out.println("select the type of login");
		int value =sc.nextInt();
		if (value==1){
			ValidationPage.adminLogin();//adminLogin is a static method inside ValidationPage class
		}else if (value==2) {
			ValidationPage.userLogin();//userLogin is a static method inside ValidationPage class
		}else  {
			System.out.println("logged out successfully");
            System.exit(0);
			}
		sc.close();
		}//end of mainpage
		
	}//end of main method


