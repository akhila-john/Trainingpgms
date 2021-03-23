package assignment;

public class TestUserPasswordLength {

	public static void main(String[] args) {
		
	try {
		UsernameAndPassword.getDetails();
		
	}catch (UserLength e) {
		System.out.println(e);
	}catch(PasswordLength e) {
		System.out.println(e);
	}
	    

}
}