package threads;

public class DaemonExample extends Thread {
	
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("daemon thread executes");
		}else {
			System.out.println("daemon not excecuting");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      DaemonExample thread1 = new DaemonExample();
      DaemonExample thread2 = new DaemonExample();
      
      thread1.setDaemon(true);
      
      thread1.start();
      thread2.start();
	}

}
