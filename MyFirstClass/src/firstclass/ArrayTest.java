package firstclass;

public class ArrayTest {

	public static void main(String[] args) {
		int[][] arrInt = {
				{ 1 , 2 },
				{3 ,4, 5}
		};
		for(int inc=0;inc<arrInt.length;inc++) {
			for(int jinc=0;jinc<arrInt[inc].length;jinc++) {
				System.out.println(arrInt[inc][jinc] + " ");
			}
			System.out.println(" ");
		// TODO Auto-generated method stub

		}
		//Multi dimensional array initializing
		int[][]arrMulti = new int[2][];
		arrMulti [0] = new int[2];
		arrMulti [1] = new int[3];
		
		arrMulti [0][0] = 11;
		arrMulti [0][1] = 22;
		arrMulti [1][0] = 33;
		arrMulti [1][1] = 44;
		arrMulti [1][2] = 55;
		
		
		for(int inc=0;inc<arrMulti.length;inc++) {
			for(int jinc=0;jinc<arrMulti[inc].length;jinc++) {
				System.out.println(arrMulti[inc][jinc] + " ");
	}
		System.out.println("");
		}
	
	}	
	}
