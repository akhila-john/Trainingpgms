package firstclass;

public class TestProgram {
     
	//diagonal sum
	     void diagonalSum()  {
			int array [][]= {
					{ 1, 2, 3 },
					{ 4, 5, 6},
					{ 7, 8, 9 }
			};
			int sum = 0;
		for (int inc=0;inc<3;inc++)
		{
			for( int jnc=0;jnc<3;jnc++)
			{ if (inc==jnc)
			   {
				sum = sum + array[inc][jnc];
			   }
			}
		}
		System.out.println("Sum of diagonal elements ="+ sum);
	 }
		
		//odd and even sum
		void evenNumber() {
			int array [][]= {
					{ 1, 2, 3 },
					{ 4, 5, 6},
					{ 7, 8, 9 }
			};
			int sumeven= 0;
					for(int inc=0;inc<array.length;inc++) {
						for(int jinc=0;jinc<array.length;jinc++)
					if (array[inc][jinc]%2==0) {
						sumeven = sumeven + array[inc][jinc];
					}
					}
		
			System.out.println("sum of even numbers is:"+sumeven);
		}	
		
  void oddNumber() {
	int array [][]= {
			{ 1, 2, 3 },
			{ 4, 5, 6},
			{ 7, 8, 9 }
	};
	int sumodd= 0;
			for(int inc=0;inc<array.length;inc++) {
				for(int jinc=0;jinc<array.length;jinc++)
			if (array[inc][jinc] % 2!=0) {
				sumodd = sumodd + array[inc][jinc];
			}
			}		
		// TODO Auto-generated method stub
     System.out.println("Sum of odd number is:"+sumodd);
	}


public static void main(String[] args) {
	TestProgram tp = new TestProgram();
	tp.evenNumber();
	tp.oddNumber();
	tp.diagonalSum();
}
}
