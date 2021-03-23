package exceptionexamples;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class CheckedExceptionExample {

	public static void main(String[] args) {
		
		PrintWriter pw = null;
		try
		{
			pw = new PrintWriter("C:\\test.txt");
			pw.println("saved");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e);
			
		}finally {
			pw.close();
		}
System.out.println("file saved succesfully");
	}

}
