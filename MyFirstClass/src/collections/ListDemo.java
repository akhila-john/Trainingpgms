package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> a1 = new ArrayList<String>();
		a1.add("raj");
		a1.add("prabhu");
		a1.add("avni");
		a1.add("avni");
		//a1.clear();clears the contents above
		System.out.println("ArrayList Elements");
		System.out.println("\t" + a1);
		//System.out.println("a1.size());  size of the arraylist
		List<String> l1 = new LinkedList<String>();
		l1.add("raj");
		l1.add("prithvi");
		l1.add("prabhu");
		System.out.println("LinkedList Elements");
		System.out.println("\t" +l1);

	}

}
