package inpuoOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsenameAndPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String username = "akhila";
		String password = "quest";
		String name =" ";
		String pass = "";
			
	 try {
		  System.out.println("enter the username");
		  username = br.readLine();
		
		  System.out.println("enter the password");
		  password = br.readLine();
		 
		
		 if (name.equals(username) && pass.equals(password)) {
			 
			 System.out.println("valid");
		 } else {
			 System.out.println("invalid");
		 }
		 
		 } catch (IOException e) {
			 e.printStackTrace();
	 }

}
}