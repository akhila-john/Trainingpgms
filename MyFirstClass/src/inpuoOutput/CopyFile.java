package inpuoOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int incr;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("D:\\html\\file2.txt");
			fos = new FileOutputStream("D:\\html\\file8.txt");
			do {
				incr = fis.read();
				if (incr != -1) {
					fos.write(incr);
				}
			} while (incr != -1);
		}catch (FileNotFoundException e) {
			System.out.println("file not found");
			e.printStackTrace();
			return;
		} catch (IOException e) {
			System.out.println("error reading the file");
			
		} finally {
			//close the file in all cases
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				System.out.println("error closing file");
			}
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				System.out.println("error closing file");
			}
		}
	}

}
