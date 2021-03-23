package firstclass;

public class MultiArray {

	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		arr[0][1]= 30;
	    arr[0][2]= 20;
		arr[0][3]= 10;
		
		arr[1][1] = 33;
		arr[1][2]=  43;
		arr[1][3]= 53;
		
		arr[2][0] = 44;
		arr[2][1]=  34;
		arr[2][2]=  54;
		
		System.out.println("Contents of the array...");
		System.out.println();
		
		for(int inc=0;inc<arr.length;inc++) {
			for(int incJ=0;incJ<arr[inc].length;incJ++) {
				System.out.print(""+arr[inc][incJ]);
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
