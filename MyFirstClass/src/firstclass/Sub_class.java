package firstclass;

public class Sub_class extends Super_Class {
	
	String name = "Infosys";
	
	void display() {
         
		System.out.println("Name is "+name);
		System.out.println("Inside sub class ");
}
	void call_method() {
		System.out.println("Name in superclass is "+name);
		display();
	}
}