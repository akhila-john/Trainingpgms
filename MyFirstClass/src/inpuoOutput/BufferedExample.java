package inpuoOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch = ' ';
		 //used when object refeence used separately
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		
		//the above 2 lines can be given as single line 
		//it is used when we create refeence only once
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the charachters, q to quit");
		
		do {
			try {
				ch = (char) br.read();
				System.out.println(ch);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} while (ch !='q');
	}

}
