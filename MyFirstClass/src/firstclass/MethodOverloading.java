package firstclass;

public class MethodOverloading {
	
	int varI = 100;
	float varf = 23.5f;
	String name = "Infy";
	
	void calculate (int arg1, int arg2) {
		long res = arg1 * arg2;
		System.out.println("Argument1 "+arg1);
		System.out.println("Argument2 "+arg2);
		System.out.println("Result is "+res);
	}
	
	void calculate(int arg1, float arg2) {
		double res = arg1 + arg2;
		System.out.println("Argument1 "+arg1);
		System.out.println("Argument2 "+arg2);
		System.out.println("Result is "+res);
	
	}
	
	void calculate(int arg1, int arg2, float arg3) {
		double res = arg1 + arg2 + arg3;
		System.out.println("Argument1 "+arg1);
		System.out.println("Argument2 "+arg2);
		System.out.println("Argument3 "+arg3);
		System.out.println("Result is "+res);
	}

	public static void main(String[] args) {
		MethodOverloading me = new MethodOverloading();
		me.calculate(100, 888,20.65f);
		me.calculate(123, 12.34f);
		me.calculate(134, 45,34.67f);
		// TODO Auto-generated method stub

	}

}
