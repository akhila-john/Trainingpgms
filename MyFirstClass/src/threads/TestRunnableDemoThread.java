package threads;

public class TestRunnableDemoThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RunnableDemoThread rdt= new RunnableDemoThread ();
		Thread t1 = new Thread(rdt);
		Thread t2 = new Thread(rdt);
		Thread t3 = new Thread(rdt);
		t1.start();
		t2.start();
		t3.start();
	}

}
