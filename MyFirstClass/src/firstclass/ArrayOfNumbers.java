package firstclass;

public class ArrayOfNumbers {

	public static void main(String[] args) {
		
		
		int array[]	= {10,24,37,49,52,62,74,87,97};
		
		
			System.out.print("Even numbers:");
		for(int inr=0;inr<array.length;inr++) {
		if (array[inr]%2==0) {
			System.out.println(array[inr]);
			
		}
		}
			System.out.println("Odd numbers are :");
			for(int inr=0;inr<array.length;inr++) {

			if(array[inr]%2!=0) {
				System.out.println(array[inr]);
				
			}
			}	
			
		
	}

	

}
