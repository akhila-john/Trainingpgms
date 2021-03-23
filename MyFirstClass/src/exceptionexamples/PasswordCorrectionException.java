package exceptionexamples;

public class PasswordCorrectionException extends Exception {

	String message;
	PasswordCorrectionException() {
		
	}
	PasswordCorrectionException(String message) {
		super(message);
		this.message= message;
	}
	public String toString()  {
		return message;
	}
}
