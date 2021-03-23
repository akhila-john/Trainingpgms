package firstclass;
import java.util.Scanner;
public class TwoDArray {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();
		System.out.println("Enter the number of coloumns");
		int coloumns = sc.nextInt();
		int array[][]=new int[rows][coloumns];
		
		System.out.println("entr the elements");
		for(int inc=0;inc<rows;inc++) {
			for (int jnc=0;jnc<coloumns;jnc++)
			{
				array[inc][jnc]=sc.nextInt();
				System.out.println();
			}
		}
		System.out.println("elements are");
		for (int inc =0;inc<rows;inc++) {
			for(int jnc =0;jnc<coloumns;jnc++) {
				System.out.print(array[inc][jnc] + " ");
				System.out.println();
			}
		}
		// TODO Auto-generated method stub

	}

}
