import java.util.LinkedList;
import java.util.Queue;



public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Queue<String> queue = new LinkedList<>();
    
    queue.add("one");
    queue.add("two");
    queue.add("three");
    queue.add("four");
    
    System.out.println(queue);
    queue.remove();
    System.out.println(queue);
    queue.remove("three");
    System.out.println(queue);
    System.out.println("queue size "+queue.size());	
    System.out.println("queue contains 'two or not? : "+queue.contains("two"));
    
    queue.clear();
	}

}
