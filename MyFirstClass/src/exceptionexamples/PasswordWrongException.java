package exceptionexamples;

public class PasswordWrongException extends Exception {
	String message;
	PasswordWrongException() {
		
	}
	PasswordWrongException(String message) {
		super(message);
		this.message= message;
	}
	public String toString()  {
		return message;
	}
}


