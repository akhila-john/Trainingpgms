package firstclass;

 public class SumOfOddAndEven {
	public static void main(String[] args) {
	int i, evensum=0, oddsum=0; 
		for (int var1 = 1;var1<=100;var1++) {
			if (var1%2==0) {
				evensum = evensum + var1;
			}else {
				oddsum = oddsum + var1;
			}
			
		}
		System.out.println("Sum of even numbers bw 1 to100 is"+evensum);
		System.out.println("Sum of odd numbers bw 1 to 100 is"+oddsum);
				
			}
				
			
		
		
		// TODO Auto-generated method stub

	}


