package firstclass;

public class BreakExample {
	void breakMethod() {
		for (int incr =1; incr <= 10; incr++) {
			if (incr ==5) {
				continue;
			}
			System.out.println(incr);
		}
	}

	public static void main(String[] args) {
		BreakExample be = new BreakExample();
		be.breakMethod();
		// TODO Auto-generated method stub

	}

}
