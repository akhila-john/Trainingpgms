package firstclass;

public class DynamicArrayEx {
	
	int arr[] = new int[20];
	void createArray() {
		int empNo = 101;
		for(int incr=0;incr<arr.length;incr++) {
			arr[incr] = empNo;
			empNo += 1;
		}
	}
	void display() {
		for(int incr = 0;incr<arr.length;incr++) {
			System.out.println(arr[incr]);
		}
	}

	public static void main(String[] args) {
		DynamicArrayEx dae = new DynamicArrayEx();
		dae.createArray();
		dae.display();
		// TODO Auto-generated method stub

	}

}
