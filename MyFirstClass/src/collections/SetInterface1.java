package collections;

import java.util.HashSet;
import java.util.Set;

public class SetInterface1 {
	public static void main(String[] args) {
		Set<Integer>  s = new HashSet<Integer>();
		s.add(30);
		s.add(68);
		s.add(30);
		s.add(76);	
		
		System.out.println(s);
	}
}
