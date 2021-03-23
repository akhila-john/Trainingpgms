package assignment;

public class PasswordLength extends Exception {
	 String message;
	PasswordLength(){
		
	}
    PasswordLength(String message) {
    	super(message);
    	this.message= message;
    	
    }
    public String toString() {
    	return "correct the length of psswd";
    }
}
