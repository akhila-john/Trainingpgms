package assignment;

import java.util.HashMap;
import java.util.Map;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person("riya ", 101);
	     Person p2 = new Person("riya", 2);
	       
	     Map<Person, String> map = new HashMap<Person, String>();
	     map.put(p1, "saju");
	     map.put(p2, "saju");
	       
	     for(Person p : map.keySet())
	     {
	         System.out.println(map.get(p).toString());
	     }
	}

}
