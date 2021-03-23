package exceptionexamples;

public class TestUsernamePasswordException {

	public static void main(String[] args) {
		CheckUsernamePasswordExample.getData();
		try
		{
	      CheckUsernamePasswordExample.validateUser();
		
		
			}catch (UsernamePasswordCorrect uw) {
				System.out.println(uw);
			}catch (PasswordWrongException up) {
				System.out.println(up);
			}catch (UsernameWrongException un) {
				System.out.println(un);
			}
		

	

			}
}