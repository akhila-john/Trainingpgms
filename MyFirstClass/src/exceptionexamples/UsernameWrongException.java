package exceptionexamples;

public class UsernameWrongException extends Exception {
	String message;
	UsernameWrongException() {
		
	}
	UsernameWrongException(String message) {
		super(message);
		this.message = message;
	}
	public String toString() {
		return message;
}
}