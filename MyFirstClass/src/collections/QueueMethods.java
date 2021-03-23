package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Queue<Integer> que = new LinkedList<> ();
  
  for (int incr= 10; incr < 15; incr++)
       que.add(incr);
       
      System.out.println(que);//display contents of queue
      
      int removedele = que.remove();//removes the first element(head)
      System.out.println(removedele);
      
      System.out.println(que);
      
      int head = que.peek();//to return the head(first elemnt) of the queue
      System.out.println(head);
      
      int head1 = que.poll();//to return and remove the head 
      System.out.println(head1);
      System.out.println(que);
	}

}
