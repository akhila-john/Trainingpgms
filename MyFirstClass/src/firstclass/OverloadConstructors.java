package firstclass;

public class OverloadConstructors {

	
	int empId =100;
	String empName = "xyz";
	double empSal = 23500.56;
	
	OverloadConstructor() {
		empId = 101;
		empName = "UST";
		empSal= 12000.45d;
		System.out.println("Inside default constructor");
		System.out.println("employee id is :" +this.empId);
		System.out.println("employee id is :" +this.empName);
		System.out.println("employee id is :" +this.empSal);
	}
	
	OverloadConstructor(int empId) {
		this.empId = empId;
		empName = "CTS";
		empSal= 65789.45d;
		System.out.println("Inside single argument constructor");
		System.out.println("employee id is :" +this.empId);
		System.out.println("employee id is :" +this.empName);
		System.out.println("employee id is :" +this.empSal);
	}
	
	OverloadConstructor(int empId ,String empName, double empSal) {
		this.empId = empId;
		this.empName = empName;
		this.empSal= empSal;
		System.out.println("Inside single argument constructor");
		System.out.println("employee id is :" +this.empId);
		System.out.println("employee id is :" +this.empName);
		System.out.println("employee id is :" +this.empSal);
	}
	
	void displayValues() {
		System.out.println("employee id is :" +empId);
		System.out.println("employee id is :" +empName);
		System.out.println("employee id is :" +empSal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
