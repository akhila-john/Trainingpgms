package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, Integer> vehicles = new HashMap<String,Integer>();
		
		
		vehicles.put("BMW",5);
		vehicles.put("AUDI",3);
		vehicles.put("FORD",4);
		vehicles.put("BENZ",10);
		
		System.out.println("total vehicles: " +vehicles.size());
		
		for (String key : vehicles.keySet())
			System.out.println(key + "-" + vehicles.get(key));
		System.out.println();
		
		System.out.println("using iterator");
		Set<String> ref = vehicles.keySet();
		Iterator<String> iter = ref.iterator();
		String s1;
		while(iter.hasNext()) {
			s1 = iter.next();
			System.out.println(vehicles.get(s1));
		}
		
	    String searchKey = "AUDI";
	    if (vehicles.containsKey(searchKey))
	    	System.out.println("found total " + vehicles.get(searchKey)+" " +searchKey +"cars");
	    
	    vehicles.clear();
	    
	    System.out.println("after clear operation,size: " +vehicles.size());
		
	}

}
