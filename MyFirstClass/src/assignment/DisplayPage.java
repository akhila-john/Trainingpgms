package assignment;

import java.util.Scanner;

public class DisplayPage {
	
	static void menuOptions() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("menu options");
		System.out.println("1.add");
		System.out.println("2.modify");
		System.out.println("3.delete");
		System.out.println("4.exit");
		System.out.println();
		System.out.println("enter the option");
		int menu = sc.nextInt();
		if (menu==1) {
			System.out.println("add items");
		}else if (menu==2){
			System.out.println("modify items");
		}else if (menu==3){
			System.out.println("delete items");
		}else {
			MainPage.mainPage();//returning to mainpage
			System.exit(0);
			
		}
	 sc.close();  
}//end of menu
}//end of DisplayPage
