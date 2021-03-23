package collections;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueOfferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue<String> queue = new LinkedBlockingQueue<>(3);
 System.out.println(queue.offer("one"));
 System.out.println(queue.offer("two"));
 System.out.println(queue);
 System.out.println(queue.offer("three"));
 System.out.println(queue);
 System.out.println(queue.offer("four"));
 System.out.println(queue);
 
 Queue<String> queue1 = new LinkedBlockingQueue<>(3);
 System.out.println(queue1.add("one"));
 System.out.println(queue1.add("two"));
 System.out.println(queue1);
 System.out.println(queue1.add("three"));
 System.out.println(queue1);
 System.out.println(queue1.add("four"));
 System.out.println(queue1);
 
	}

}
