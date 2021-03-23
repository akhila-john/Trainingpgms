package inpouOutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String source = "The data and calender classes"
				+ "not thread safe, leaving developers to deal with the "
				+ "headache of hard to debug issues"
				+ "write additional code to handle thread safety";
		byte buf[] = source.getBytes();
		
		FileOutputStream fos1 = null;
		FileOutputStream fos2 = null;
		FileOutputStream fos3 = null;
		
		try {
			fos1 = new FileOutputStream("C:\\test\\file1.txt");
			fos2 = new FileOutputStream("C:\\test\\file2.txt");
			fos3 = new FileOutputStream("C:\\test\\file3.txt");
			
			for( int incr = 0; incr<buf.length; incr+=2) {
				fos1.write((char)buf[incr]);
				
				fos2.write(buf);
				
				fos3.write(buf,buf.length-buf.length/4,buf.length/4);
				
			}
				
			
		} catch (IOException e) {
			System.out.println("an I/o error ocurred");
		} finally {
			try {
				if(fos1 != null) {
					fos1.close();
				}
			}catch(IOException e) {
				System.out.println("error closing file1.txt");
			}
			try {
				if(fos2 != null) {
					fos2.close();
				}
			}catch(IOException e) {
				System.out.println("error closing file2.txt");
			}
			try {
			if(fos3 != null) {
				fos3.close();
			}
			} catch(IOException e) {
			System.out.println("error closing file3.txt");
		}
			}
		
	

				
				
	}

}
