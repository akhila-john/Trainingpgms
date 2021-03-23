package collections;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Deque<String> deque = new LinkedList<>();
    
    deque.add("java");
    deque.addFirst("jquery");
    deque.addLast("html");
    
    deque.offer("angularjs");
    deque.offerFirst("nodejs");
    deque.offerLast("javascript");
    
    System.out.println(deque);
    
    System.out.println("first elemnt before removal" +deque.getFirst());
    deque.removeFirst();
    deque.pop();
    
    System.out.println (deque.peekFirst());
    System.out.println(deque.getLast());
    System.out.println(deque.removeLast());
    System.out.println(deque.peekLast());
    
    System.out.println("normal iteration");
    Iterator<String> it1 = deque.iterator();
    while(it1.hasNext()) {
    	System.out.println("  " +it1.next());
    }
    
    System.out.println("reverse iteration");
    Iterator<String> it2 = deque.descendingIterator();
    while(it2.hasNext()) {
    	System.out.println("  " +it2.next());
    
    }
	}

}
