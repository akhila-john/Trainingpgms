package threads;

public class ExtendsThreadDemo extends Thread {

	public void run() {
		try {
			for(int i=0;i<50;i++) {
				System.out.println(i);
				Thread.sleep(100);
				
			}
		}catch (InterruptedException e) {
			
		}
	}
}
