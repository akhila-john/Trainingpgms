package inpuoOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderReaderLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = " ";
		System.out.println("enter lines of test");
		System.out.println("enter stop to quit");
		
		do {
			try {
				str = br.readLine();
				System.out.println(str);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} while (!str.equals("stop"));
	}

}
