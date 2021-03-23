package exceptionexamples;

public class UsernamePasswordWrong extends Exception {
	String message;
	UsernamePasswordWrong() {
		
	}
	UsernamePasswordWrong(String message) {
		
		this.message = message;
	}
	public String toString() {
		return message;
}
}


