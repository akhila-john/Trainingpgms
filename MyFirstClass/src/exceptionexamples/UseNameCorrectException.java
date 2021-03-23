package exceptionexamples;

public class UseNameCorrectException extends Exception{

	String message;
	UseNameCorrectException() {
		
	}
	UseNameCorrectException(String message) {
		super(message);
		this.message = message;
	}
	public String toString() {
		return message;
	}
}
