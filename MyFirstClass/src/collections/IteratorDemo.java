package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorDemo {
           static void iteratorDemo()  {
        	   /*Set<Integer>  s = new HashSet<Integer>();//using set
       		s.add(30);
       		s.add(68);
       		s.add(30);
       		s.add(76);*/	
        	   List<String> a1 = new ArrayList<>();//using list
        	   a1.add("infosys");
        	   a1.add("ust global");
        	   a1.add("tcs");
        	   a1.add("wipro");
        	   
        	   Iterator<String> iter;// reference created for the iteration
        	   iter = a1.iterator();
        	   
        	   while (iter.hasNext())  {
        		   System.out.println(iter.next());
        	   }//end of loop
           }
	public static void main(String[] args) {
		iteratorDemo();

	}

}
