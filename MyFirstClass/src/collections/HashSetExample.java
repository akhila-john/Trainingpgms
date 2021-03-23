package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
	
		Set<String> fruits = new HashSet();
		
		fruits.add("apple");
		fruits.add("banana");
		
		System.out.println("fruits set is empty = " +fruits.isEmpty());
		
		System.out.println("fruits contains apple = " +fruits.contains("apple"));
		
		System.out.println("fruits removed from sets = " +fruits.remove("apple"));
		
		System.out.println("fruits contains apple = " +fruits.contains("apple"));
		
		System.out.println("fruits set size = " +fruits.size());
		
		List<String> list = new ArrayList();
		list.add("apple");
		list.add("apple");
		list.add("bannana");
		
		System.out.println("fruits set before addAll = "+fruits);
		System.out.println("list = " +list);
		fruits.addAll(list);
		System.out.println("fruits after addAll =" +fruits);
		
		
		Iterator<String> iterator = fruits.iterator();
		while(iterator.hasNext());
		System.out.println("consuming fruit" +iterator.next());
		
		fruits.add("orange");
		System.out.println("fruit set before removeAll = " +fruits);
		System.out.println("list = " +list);
		fruits.removeAll(list);
		System.out.println("fruits after remove all = " +fruits);
		

	}

}
