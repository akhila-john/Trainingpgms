package pgms;

import java.util.Scanner;

public class MatrixAddition {
	
	static void add() {
		
		try {
		Scanner sc = new  Scanner(System.in);
		int i,j,row,col,sum=0;
		System.out.println("enter the number of rows");
		row = sc.nextInt();
		System.out.println("enter the number of coloumn");
		col = sc.nextInt();
		
		if (row==0| col==0) {
			throw new RuntimeException();
		}
		
		int matA[][] = new int[row][col];
		int matB[][] = new int[row][col];
		
		System.out.println("enter elemnts of matrix A");
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				matA[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("enter elemnts of matrix B");
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				matB[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("sum of two matrix");
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				sum = matA[i][j] + matB[i][j];
				System.out.println(sum);
			}
			System.out.println();
		}
	} catch (RuntimeException e) {
		System.out.println("row or coloumn cannot be zero");
	}
	}

	
}
