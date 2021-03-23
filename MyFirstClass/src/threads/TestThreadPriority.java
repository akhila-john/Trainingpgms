package threads;

public class TestThreadPriority {
    public static Thread T1,T2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ThreadPriority tp = new ThreadPriority();
      Thread T1 = new Thread(tp);
      Thread T2 = new Thread(tp);
      
      System.out.println("default priority of thread is" +T1.getName()+"="+T1.getPriority());
      System.out.println("default priority of thread is" +T2.getName()+"="+T2.getPriority());
      
      T1.setPriority(Thread.MAX_PRIORITY-6);
      T2.setPriority(7);
      T1.start();
      T2.start();
      System.out.println("new priority of thread is" +T1.getName()+" ="+T1.getPriority());
      System.out.println("new priority of thread is" +T2.getName()+" ="+T2.getPriority());
	}

}
