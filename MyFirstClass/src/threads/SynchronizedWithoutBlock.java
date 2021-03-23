package threads;

import java.util.Arrays;

public class SynchronizedWithoutBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = {"one","two","three","four","five","six","seven"};
		
		HashMapProcessor hmp = new HashMapProcessor(arr);
		
		Thread thread1 = new Thread(hmp,"thrd1");
		Thread thread2 =new Thread(hmp,"thrd2");
		Thread thread3 = new Thread(hmp,"thrd3");
		
		long start = System.currentTimeMillis();
		//start all the threads
		thread1.start();
		thread2.start();
		thread3.start();
		//wait for thread to finish
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("time taken= " + (System.currentTimeMillis()- start));
		//check the shared variable value now
		System.out.println(Arrays.asList(hmp.getMap()));
	}

}
