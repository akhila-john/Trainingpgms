package inpuoOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (FileInputStream fis = new FileInputStream("C\\test\\file9")) {
		do {
			System.out.println((char)fis.read());
		} while (fis.available()!=0);
	}catch (IOException e) {
		e.printStackTrace();
	}
	}
}
