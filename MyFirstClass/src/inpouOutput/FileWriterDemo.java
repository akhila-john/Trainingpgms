package inpouOutput;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String source ="the date and calender classes are" +"not thread safe"+
		"headache of hard to debud the issues "
		+ "write additional code to handle thread"
		+ "on the new date and time api introduces"
		+ "thus taking that headache away";
		
		char buf[] = new char[source.length()];
		source.getChars(0, source.length(),buf, 0);
		
		try (FileWriter fos1 = new FileWriter("C:\\test\\file12.txt");
				FileWriter fos2 = new FileWriter("C:\\test\\file22.txt");
				FileWriter fos3 = new FileWriter("C:\\test\\file33.txt")) {
			//writing to first file
			for (int incr=0; incr<buf.length; incr+=2) {
				fos1.write((char) buf[incr]);
			}
			//writing to second file
			fos2.write(buf);
			
			fos3.write(buf, buf.length-buf.length/4, buf.length/4);
			
			
		} catch (IOException e) {
			System.out.println("an i/o eror occured...");
		}
		
		
	}

}
