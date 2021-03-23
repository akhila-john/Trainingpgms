package threads;

public class MyClass implements Runnable {

	static String message[] = {"java", "is","hot","multithreaded","and",
			  "platform independent"};
	String name;
	
	public MyClass (String id) {
		name = id;
	}
	
	public void run() {
		for (int i =0;i<message.length;++i) {
			randomWait();
			System.out.println(name + message[i]);
		}
	}
	
	void randomWait() {
		try {
			Thread.currentThread();
			Thread.sleep((long) (3000 * Math.random()));
		}catch (InterruptedException x) {
			System.out.println("interrupted");
		}
	}



	
}
