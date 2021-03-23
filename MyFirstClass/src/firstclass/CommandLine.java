package firstclass;

public class CommandLine {

	public static void main(String[] args) {
		int var1 = Integer.parseInt(args[0]);
		int var2 = Integer.parseInt(args[2]);
		float var3 = Float.parseFloat(args[2]);
		
		double res = var1 +var2 + var3;
		
		System.out.println("Result is"+res);
		// TODO Auto-generated method stub

	}

}
