package src.testpack1;

public class Superclass_one {

	protected String username;
	protected String password;
	
	protected Superclass_one(String username,String password)  {
		this.username = username;
		this.password = password;
		
	
	}
	 protected void Validateuser(String username,String password) {
		
		 if(username.equals(username)) {
			 if(password.equals(password))
			 {
				 System.out.println("valid");
			 }
			 else {
				 System.out.println("not valid");
			 }
		 }
	}
}
