package collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class TreeSetExample {

	public static void main(String[] args) {
		Set<String> example = new TreeSet<String>();
		
		example.add("C");
		example.add("A");
		example.add("B");
		example.add("D");
		example.add("E");
		
		Iterator<String> iterator;
		iterator = example.iterator();
		
		System.out.println("tree set string chara arrangements are: ");
		while(iterator.hasNext())  {
			System.out.println(iterator.next() + " ");
		}
       System.out.println("tree set size: "  + example.size());
	}

}
