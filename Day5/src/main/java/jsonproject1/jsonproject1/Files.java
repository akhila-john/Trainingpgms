package jsonproject1.jsonproject1;

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
			//String  = null;
			while(sc.hasNextLine()) {
			    JSONObject obj = new JSONObject();
				
			  String data = sc.nextLine();
			  if (data.trim().length() > 0 && data.contains("INSERT")) {
				String[] result = data.split(" ");
				String name= result[5].replace(",", "");
				String time = result[1];
				obj.put("id", ++id);
				obj.put("appName",name);
				obj.put("timeStamp",time);
					
				array.add(obj);
					}
				}
			System.out.println("enter the appname");
			Scanner sc1 = new Scanner(System.in);
			
			String appName = sc1.next();
			
			for (int i=0; i<array.size();i++) {
				JSONObject obj = (JSONObject) array.get(i);
				if(appName.equals(obj.get("appName"))) {
					System.out.println("timeStamp");
					System.out.println(obj.get("timeStamp"));
				}
			}
			
		  }catch (FileNotFoundException e) {
			System.out.println("error occured");
			e.printStackTrace();
		 }
		
	}
}
