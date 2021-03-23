package firstclass;

public class TestArray1 {
	void min(int arr[]) {
		int min = arr[0];
		for(int inc=1;inc<arr.length;inc++) {
			if (min>arr[inc]) {
				min = arr[inc];
			}
		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		int a[] = {33,3,4,5};
		new TestArray1().min(a);
		

	}

}
