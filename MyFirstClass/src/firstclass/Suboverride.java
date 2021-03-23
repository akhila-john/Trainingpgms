package firstclass;

public class Suboverride extends SuperOverriding {
	
	double calculate(float arg1, float arg2) {
		float var1 = arg1 + 10;
		float var2 = arg2 * 2;
		double res = var1 + var2 ;
		System.out.println("Result is :"+res);
		return res;
	}
	

}
