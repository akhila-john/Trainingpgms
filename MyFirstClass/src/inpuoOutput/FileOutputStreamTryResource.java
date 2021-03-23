package inpuoOutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTryResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String source = "The data and calender classes"
				+ "not thread safe, leaving developers to deal with the "
				+ "headache of hard to debug issues"
				+ "write additional code to handle thread safety";
		byte buf[] = source.getBytes();
		
		try (FileOutputStream fos1 = new FileOutputStream("E:\\test\\file1.txt");
				FileOutputStream fos2 = new FileOutputStream("E:\\test\\file2.txt");
				FileOutputStream fos3 = new FileOutputStream("E:\\test\\file3.txt")) {
		
		
		for( int incr = 0; incr<buf.length; incr+=2) {
			fos1.write((char)buf[incr]);
			
			fos2.write(buf);
			
			fos3.write(buf,buf.length-buf.length/4,buf.length/4);
			
		}
		} catch (IOException e) {
			System.out.println("an i/o error ocurred");
		}
	}

}
