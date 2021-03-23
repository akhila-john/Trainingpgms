package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapSetExample {

	public static void main(String[] args) {
		
		Map<String,String> companies = new HashMap<String,String>();
		
		companies.put("infosys", "mysore");
		companies.put("ust", "tvm");
		companies.put("quest", "techpark");
		companies.put("tcs", "bnglore");
		companies.put("sap", "itpl");
		companies.put("oracle", "us");
		
		Set< Map.Entry<String,String>>company = companies.entrySet();
		
		for (Map.Entry<String,String> entry : company) {
			System.out.println("Key is "+ entry.getKey() + " value is" + entry.getValue());
		}
		
		System.out.println("\n displaying using iterator..\n");
		Set<Map.Entry<String,String>> companySet = companies.entrySet();
		Iterator<Map.Entry<String,String>> iter = companySet.iterator();
		
		while(iter.hasNext())  {
			Map.Entry<String,String> entry = iter.next();
			System.out.println("key is "+entry.getKey() +"value is " +entry.getValue());
		}
	};

}
