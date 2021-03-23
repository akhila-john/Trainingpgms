package firstclass;

public class EnhancedForLoop {

	public static void main(String[] args) {
		int [] numbers = {10,20,30,40,50};
		
		for (int var1 : numbers) {
			System.out.println(var1);
			System.out.println(",");
		}
       System.out.println("\n");
       
       String [] names = {"raj","rewm"};
       for (String name : names) {
			System.out.println(name);
			System.out.println(",");
		}
	}

}
