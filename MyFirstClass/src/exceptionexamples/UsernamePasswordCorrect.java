package exceptionexamples;

public class UsernamePasswordCorrect extends Exception {
	String message;
	UsernamePasswordCorrect() {
		
	}
	UsernamePasswordCorrect(String message) {
		
		this.message = message;
	}
	public String toString() {
		return message;
}
}
