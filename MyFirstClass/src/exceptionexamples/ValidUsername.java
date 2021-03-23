package exceptionexamples;

public class ValidUsername extends Exception {

	public static void main(String[] args) {
			String message ;
	    
			ValidUsername() {
			
		}
		ValidUsername(String message) {
			super(message);
			this.message= message;
		}
		public String toString()  {
			return "correct length" ;
		}
	}
	}


