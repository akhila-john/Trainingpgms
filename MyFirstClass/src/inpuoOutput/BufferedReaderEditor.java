package inpuoOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEditor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str [] = new String[100];
		System.out.println("enter the lines of text");
		System.out.println("enter" + "stop"+ "to quit");
		
		for (int incr =0; incr< 100; incr++) {
			try {
				str[incr] = br.readLine();
				if (str[incr].equals("stop")) {
				  break;
				  
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	System.out.println("here are the details");
	for (int incr =0; incr<100 ; incr++) {
		if (str[incr].equals("stop")) {
			break;
		}
		System.out.println(str[incr]);
	}

}
}