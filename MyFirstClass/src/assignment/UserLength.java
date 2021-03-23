package assignment;

public class UserLength extends Exception {
	
	String message;
	UserLength(){
		
	}
    UserLength(String message) {
    	super(message);
    	this.message = message;
    	
    }
    public String toString() {
    	return "correct the length";
    }
    
}
