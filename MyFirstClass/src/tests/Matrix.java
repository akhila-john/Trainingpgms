package tests;

public class Matrix {

	public static void main(String[] args) {
		int a[][] = {{1,2},{4,5}};
		int b[][] = {{3,1},{2,1}};
		int sum[][] = new int[2][2];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				sum[i][j] = a[i][j] + b[i][j];
				System.out.println(sum[i][j]);
			}
			System.out.println();
		}

	}

}
