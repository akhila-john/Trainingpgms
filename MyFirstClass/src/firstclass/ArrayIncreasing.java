package firstclass;

public class ArrayIncreasing {
	
	void increaseSizeOfArray() {
		int array1[] = {10,20,30,40,50};
		System.out.println("Contents of array before increasing size..");
		for(int inc=0;inc<array1.length;inc++) {
			System.out.print(array1[inc]+" ");
		}
		int temp[] = array1;
		array1 = new int[10];
		System.out.println();
		System.out.println("Contents of array before increasing size..");
		for(int inc=0;inc<array1.length;inc++) {
			System.out.print(array1[inc]+" ");
		}
			
		System.arraycopy(temp,  0 , array1, 0,5);
			System.out.println();
			System.out.println("Contents of array after copying ..");
			for(int inc=0;inc<array1.length;inc++) {
				System.out.print(array1[inc]+" ");
	}
	}		
	public static void main(String[] args) {
		ArrayIncreasing ae = new ArrayIncreasing();
		ae.increaseSizeOfArray();
		
	}
		// TODO Auto-generated method stub

	

}
