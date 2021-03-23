package firstclass;

public class Super_Class {
	
	String name_super = "Rapid";
	
	Super_Class() {
		System.out.println("Inside the constructor");
	}
	Super_Class(int var1){
		System.out.println("Inside superclass constructor.");
		System.out.println("Value inside the constructor is "+var1);
	}

	void display_super() {
		System.out.println("Name is "+name_super);
		System.out.println("Inside super class..");
	}

}
