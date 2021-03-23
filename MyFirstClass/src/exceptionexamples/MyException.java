package exceptionexamples;

public class MyException extends Exception {

	private int detail;
	MyException(int arg) {
		detail = arg;
	}
	
	public String toString() {
		return "MyException[" +detail + "]";
	}
}
