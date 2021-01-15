package jsonproject.jsonproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Files {

	public static void main(String[] args) {
		
		File file = new File("asset/test.txt");
		try {
		    Scanner sc = new Scanner(file);
		    int id =0;
		    
			JSONArray array = new JSONArray();
			
			while(sc.hasNextLine()) {
			    JSONObject obj = new JSONObject();
				
			  String data = sc.nextLine();
			  if (data.trim().length() > 0 && data.contains("INSERT")) {
				String[] result = data.split(" ");
				String appName= result[5].replace(",", "");
				String timeStamp = result[1];
				obj.put("id", ++id);
				obj.put("appName",appName);
				obj.put("timestamp",timeStamp);
					
				array.add(obj);
					}
				}
			
			JSONObject obj2 = new JSONObject();
			obj2.put("studies", array);
			System.out.println(obj2);
				
		        
		 }catch (FileNotFoundException e) {
			System.out.println("error occured");
			e.printStackTrace();
		 }
		
	}
}
