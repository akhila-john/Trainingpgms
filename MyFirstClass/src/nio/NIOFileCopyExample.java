package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class NIOFileCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try {
		Path source = Paths.get("D:\\java\\file1.txt");
		Path destination = Paths.get("D:\\java\\file2.txt");
		
		//copy the file
		Files.copy(source, destination,
				StandardCopyOption.REPLACE_EXISTING);
	} catch (InvalidPathException e) {
		System.out.println("path error" +e);
		
	} catch (IOException e) {
		System.out.println("I/O exception " +e);
	}
	
	}

}
