package threads;

public class TestExtends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendsThread E1 =new ExtendsThread("Thread-1");
		  E1.start();
		  
		 ExtendsThread E2 =new ExtendsThread("Thread-2");
		  E2.start();
	}

}
