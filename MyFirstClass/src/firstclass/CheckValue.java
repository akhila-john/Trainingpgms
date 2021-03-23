package firstclass;

import java.util.Scanner;

public class CheckValue {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("Enter the username");
		String name = sc.next();
		
		
		System.out.println("Enter the passwd");
		String psswd = sc.next();
		sc.close();
		 String s1="Quest";
		 String s2="Global";
		
		
		System.out.println(s1.equals(name));
		System.out.println(s2.equals(psswd));
		System.out.println(s1);
		System.out.println(s2);
		
		if (s1.equals(name)) {
			System.out.println("username is correct ");
		}else {
				System.out.println("username is incorrect");
			}
		
		if (s2.equals(psswd)) {
			System.out.println("pasword is correct");
		}else {
			 System.out.println("password is incorrect");
		}
		
		
		// TODO Auto-generated method stub

	}

}
