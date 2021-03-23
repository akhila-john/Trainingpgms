package assignment;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class MapExample {

	public static void main(String[] args) {
		
		Map<String,String> data = new HashMap<>();
		
		data.put("A", "A");
		data.put("B", "B");
		data.put("C", "C");
		data.put("D", null);
		System.out.println(data.put(null, "Z"));
		System.out.println(data.put(null, "P"));
		System.out.println(data.put(null, "Q"));
        data.put("R", null);
        System.out.println("Contents of map..");
        System.out.println(data);
        String value = data.get("C");
        System.out.println("kEY = P,Values = " + value);
        
        value = data.getOrDefault("P" , "Default Value");
        System.out.println("Key = P, Values=" +value);
        
        boolean keyExists = data.containsKey(null);
        boolean valueExists = data.containsValue("Q");
        
        System.out.println("keyExixts= " + keyExists + " , valueExists = " + valueExists);
        
        Set<Entry<String,String>> entrySet = data.entrySet();
        System.out.println(entrySet);
        
        
       System.out.println("data map size =" +data.size());
       
       Map<String,String> data1 = new HashMap<>();
       data1.putAll(data);
       System.out.println("data1 mappings= " +data1);
       
       String nullKeyValue = data1.remove(null);
       System.out.println("data1 null key value = " +nullKeyValue);
       System.out.println("data1 after removing null key =" + data1);
       
       Set<String> keySet = data.keySet();
       System.out.println("data map keys = " +keySet);
       
       Collection<String> values = data.values();
       System.out.println("data map values = " +values);
       
       data.clear();
       System.out.println("data map is empty = "+ data.isEmpty());
       
       
       
       
       
       
       
       
	}

}
