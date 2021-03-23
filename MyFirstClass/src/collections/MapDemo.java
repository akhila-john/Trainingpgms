package collections;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> m1 = new HashMap<Integer,String>();
		System.out.println(m1.put(1,"Raj"));
		System.out.println(m1.put(2,"prithw"));
        m1.put(3,"avni");
        System.out.println(m1.put(1,"quest"));
        System.out.println(m1.put(5,"quest"));
        System.out.println(m1.put(null,"infosys"));
        System.out.println(m1.put(null,"tcs"));
        
        System.out.println();
        System.out.println("map elements");
        System.out.println("\t" +m1);
	}

}
