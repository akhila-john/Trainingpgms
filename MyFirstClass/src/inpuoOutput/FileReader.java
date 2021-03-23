package inpuoOutput;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileReader;
public class FileReader {

	public FileReader(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String source ="the date and calender classes are" +"not thread safe"+
				"headache of hard to debud the issues "
				+ "write additional code to handle thread"
				+ "on the new date and time api introduces"
				+ "thus taking that headache away";
		
		//char buf[] = new char[source.length()];
		//source.getChars(0, source.length(),buf, 0);
		
		try (FileReader fr1 = new FileReader("D:\\html\\file4.txt");) {
			
			int value;
			while ((value = fr1.read())!= -1) {
				System.out.println((char) value);
			}
			
			
		    }catch (IOException e) {
				System.out.println("an i/o eror occured...");
			}
			
			
		}
		
	}


