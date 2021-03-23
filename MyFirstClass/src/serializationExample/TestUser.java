package serializationExample;

public class TestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user = new User();
		user.setUserId(100);
		user.setUserAddress("thrissur");
		user.setUserName("riya");
		user.setUserPin(324);
		
		System.out.println("userid is:"+user.getUserId());
		System.out.println("username is:"+user.getUserName());
		System.out.println("useraddress is:"+user.getUserAddress());
		System.out.println("userpin is:"+user.getUserPin());

	}

}
