package threads;

public class ThreadPriority implements Runnable {

	public void run()
	{
		System.out.println(Thread.currentThread().getName() +"is running");
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException ie) {
			
		}
		System.out.println(Thread.currentThread().getName() +"has finished excecution");
		
	}
}
