package serializationExample;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UsernameAndPin uap = new  UsernameAndPin();
		//UsernameAndPinValidation uv = new UsernameAndPinValidation();
		
		Validation v1 =new Validation();
		v1.input();
		
		Validation vl= new Validation();
		vl.validation();
		
		//uap.setUserName("akhila");
		//uap.setUserPin(123);
		//System.out.println(uap.getUserName());
	}

}
