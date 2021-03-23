package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {

	
		static List<String> l1;
		
		static void createList()  {
			l1 = new LinkedList();
			l1.add("infosys");
			l1.add("tcs");
			l1.add("wipro");
			l1.add("quest");
		}//end of create list
		
		static void traverseList() {
			System.out.println("moving top to bottom");
			ListIterator<String> iter = l1.listIterator();
			while(iter.hasNext()) {
				System.out.println(iter.next());
			}//end of while
			System.out.println("**********");
			
			System.out.println("moving bottom to top");
			while(iter.hasPrevious()) {
				System.out.println(iter.previous());
			} //end of while
		}//end of traverse list
		
		public static void main(String[] args) {
			createList();
			traverseList();
	}

}
