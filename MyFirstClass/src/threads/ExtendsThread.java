package threads;

public class ExtendsThread extends Thread {
	private Thread t;
	 private String threadName;
	 
	 ExtendsThread(String name)  {
		 threadName = name;
		 System.out.println("creating" +threadName);
	 }
	 
	 public void run() {
		 System.out.println("running" +threadName);
		 try {
			 for (int i =4; i > 0; i--) {
				 System.out.println("thread" +threadName+ " ," + i);
				 Thread.sleep(50);
			 }
		 }catch (InterruptedException e) {
			 System.out.println("thread "+ threadName + " interrupted.");
		 }
		 System.out.println("thread " +threadName + "existing.");
	 }
	 
	 public void start() {
		 System.out.println("starting " +threadName);
		 if (t==null) {//checks whether any reference given or not
			 t= new Thread(this,threadName);
			 t.start();
		 }
	 }
}
