

	import java.util.Scanner;

import firstclass.StringClass;
import firstclass.TestClass;
import firstclass.TestClass1;
	public class UsernameAndPassword {
	 public static void main(String[] args) {
			String validUsername="Quest";
			String validPassword="Global";
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Username");
			String username1=sc.next();
			System.out.println("Enter the Password");
			String password1=sc.next();
			sc.close();
			if(validUsername.equals(username1)){
				if (validPassword.equals(password1)) {
				 StringClass scs = new StringClass();
				 System.out.println(scs);
				 }//end of inner if
			else  { 
				TestClass tc = new TestClass();
				System.out.println(tc);
				}//end of else
			}//end of if
			else  { 
				TestClass1 tcs = new TestClass1() ;
				System.out.println(tcs);
				}	//end of else
			
			
		}	//End of main method
			} //End of main class


