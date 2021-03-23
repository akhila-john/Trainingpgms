package threads;

public class MyThread extends Thread {
    static String message[]= {"java","is","hot","multithreaded","safe"};
    
    public MyThread(String id) {
    	super(id);
    }
    public void run() {
    	SynchronizedOutput.displayList(getName(),message);
    }
    
    void randomWait() {
    	try {
    		sleep((long) (3000 *Math.random()));
    	}catch (InterruptedException x) {
    		System.out.println("interrupted");
    	}
    }
}
class SynchronizedOutput {
	public static synchronized void displayList(String name, String list[])
	{
		for(int i=0; i<list.length; ++i) {
			MyThread t = (MyThread) Thread.currentThread();
			t.randomWait();
			System.out.println(name +list[i]);
		}
	}
}