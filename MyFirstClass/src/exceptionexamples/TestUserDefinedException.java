package exceptionexamples;

public class TestUserDefinedException {

	public static void main(String[] args) {
		
		try {
			UserDefinedException.compute(9);
		} catch (MyException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			UserDefinedException.compute(10);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
