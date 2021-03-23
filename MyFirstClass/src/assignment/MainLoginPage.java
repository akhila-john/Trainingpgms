package assignment;

import java.util.Scanner;

public class MainLoginPage {
	void mainPage() {
		Scanner sc= new Scanner(System.in);
		System.out.println("1 Administrator");
		System.out.println("2 Customer");
		System.out.println("3 Exit");
		System.out.println();
		System.out.println("select the type of login");
		int value =sc.nextInt();
		if (value==1){
			admin();
		}else if (value==2) {
			customer();
		}else  {
			System.exit(0);
		}
		}//end of mainpage
	
	void admin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of items");
		int num =sc.nextInt();
		int itemNo[]= new int[num];
		String itemName[]= new String[num];
		int itemPrice[]= new int[num];
		int itemQuantity[]= new int[num];
		for(int inc=0; inc<num ;inc++) {
			
			itemNo[inc] =inc+1;
			System.out.println("give the itemname");
			itemName[inc]= sc.next();
			System.out.println("give the itemprice");
			itemPrice[inc]= sc.nextInt();
			if(itemPrice[inc]==0) {
				System.out.println("provide nonzero value for the price");
				System.out.println("give the itemprice");
				itemPrice[inc]= sc.nextInt();
			}
			System.out.println("give the quantity");
			itemQuantity[inc]= sc.nextInt();
			if(itemQuantity[inc]==0) {
				System.out.println("provide nonzero value for the quantity");
				System.out.println("give the itemquantity");
				itemQuantity[inc]= sc.nextInt();
			}
			
		System.out.println("itemNo :" +itemNo[inc]);
		System.out.println("itemName :"	+itemName[inc]);
		System.out.println("itemPrice :" +itemPrice[inc]);
		System.out.println("itemQuantity :"	+itemQuantity[inc]);
		
        /*int sum =0;
		
		for(int inc=0;inc<num;inc++) {
			//sum=sum + itemPrice[inc];
			//System.out.println(sum);
		}*/
		
		
		} //end of if
		
	}//end of items
	
	void customer() {
		System.out.println("Items to be purchased");
		admin();
		
		/*Scanner sc = new Scanner(System.in);
		int sum =0;
		
		for(int inc=0;inc<num;inc++) {
			sum=sum + itemPrice[inc];
			System.out.println(sum);
		}*/
		
		}//end of customer
	
	void payBill() {
		Scanner sc= new Scanner(System.in);
		System.out.println("1 Login");
		System.out.println("2 New User");
		System.out.println("3 Exit");
		System.out.println();
		System.out.println("select the type of login");
		int value =sc.nextInt();
		if (value==1){
			login();
		}else if (value==2) {
			newUser();
		}else  {
			System.exit(0);
		}
	}// END OF PAYBILL
	
	void login() {
		double validAccountNumber = 123456789;
		int validPinNumber= 4321;
		Scanner sc = new Scanner(System.in);
		System.out.println();
		
		
		System.out.println("enter the AccountNumber");
	    long accountNumber=sc.nextInt();
		System.out.println("enter the PinNumber");
		long pinNumber =sc.nextInt();
		
		if ((validAccountNumber == accountNumber)&&(validPinNumber==pinNumber)) {
			System.out.println("valid bank details");
			}else  {
				//System.out.println("invalid bank details");
				login();
			}
		
		
		}//end of login
	
	void newUser() {
	    //int accn=123;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the account number");
		long accno = sc.nextLong();
        // if (accn.length()<10) {
			//System.out.println("invalid length");
		//}
		System.out.println("enter the pin number");
		long pinno = sc.nextLong();
		System.out.println("enter the balance amount");
		long bal = sc.nextLong();
		
		
		//payBill();
		
	    }//end of new user
	
	
//////////////////////////////////////////////	
	
	/*void bank() {
		int validAccountNumber = 123;
		//int validPinNumber= 4321;
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		
		for(int i=0;i<3;i++) {
			
		System.out.println("enter the AccountNumber");
	    long accountNumber=sc.nextInt();
		//System.out.println("enter the PinNumber");
		//long pinNumber =sc.nextInt();
		
			if (!validAccountNumber.equals (accountNumber)) {
				System.out.println("acess denied");
				}else  {
					System.out.println("valid bank details");
				}
				
		}
		
	}*/
	
	
	
	
	
	
	
	
	
	
} // end of main method
