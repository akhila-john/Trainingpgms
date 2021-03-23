package files;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ReadFile {

	public static void main(String[] args) {
		JSONObject obj = new JSONObject();  //creating a json object
		obj.put("name" , "akhu");   //inserting values using put method
		obj.put("gender" , "female");
		obj.put("age" , 23);
		
		
		JSONArray list = new  JSONArray();  //creating an JSON list array
        list.add("email:akh7@gmail.com");       //adding values to the array
        list.add("phone:4567");
        list.add("city: tvm");
        
        obj.put("details",list);    //adding the list to the object
        
       
       System.out.println(obj);

	}

}
