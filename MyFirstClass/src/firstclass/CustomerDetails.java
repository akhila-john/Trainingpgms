package firstclass;

import java.util.Scanner;
public class CustomerDetails {
	
	String name = "Riya";
	String gender = "Female";
	int age = 24;
	int weight = 60;
	
	void details (String name,String gender,int age,int weight)
	{
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
		System.out.println("Name is:"+name);
		System.out.println("Gender is:"+gender);
		System.out.println("Age  is:"+age);
		System.out.println("Weight is:"+weight);
	
	
	
		if (age<18) {
			System.out.println("details cannot be displayed");
		}else {
			System.out.println("Name is:"+name);
			System.out.println("Gender is:"+gender);
			System.out.println("Age  is:"+age);
			System.out.println("Weight is:"+weight);
		
		}//end of loop	
	}// end of constructor
	 
	public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the name:");
		String name = sc.next();
		
		System.out.println("Enter the gender:");
		String gender = sc.next();
		
		System.out.println("Enter the age:");
		int age = sc.nextInt();
		
		System.out.println("Enter the weight:");
		int weight = sc.nextInt();
		
		
		CustomerDetails cd = new CustomerDetails();
		cd.details(name,gender,age,weight);
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}//end of main
