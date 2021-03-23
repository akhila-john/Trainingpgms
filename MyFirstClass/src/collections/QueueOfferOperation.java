package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOfferOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue<String> queue = new LinkedList<>();

queue.offer("one");
queue.offer("two");
System.out.println(queue);
System.out.println(queue.poll());
System.out.println(queue.poll());
System.out.println(queue.poll());

queue.offer("one");
queue.offer("two");
System.out.println(queue);
System.out.println(queue.remove());
System.out.println(queue.remove());
System.out.println(queue.remove());
	}

}
