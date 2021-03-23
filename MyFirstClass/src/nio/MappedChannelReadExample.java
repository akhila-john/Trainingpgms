package nio;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MappedChannelReadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(FileChannel fChan = (FileChannel) Files.newByteChannel(
				Paths.get("D\\JAVA\\file2.txt"),
				StandardOpenOption.WRITE,
				StandardOpenOption.READ))  {
			//GET SIZE OF THE FILE
			long fSize = fChan.size();
			
			//map the file into a buffer
			MappedByteBuffer nBuf = fChan.map(MapMode.PRIVATE,0, fSize);
			
			//read and display bytes from bufer
			for (int incr=0; incr<fSize; incr++) {
				System.out.println((char) nBuf.get());
			}
			System.out.println();
		}catch (InvalidPathException e) {
			System.out.println("path error"+e);
		}catch (IOException e) {
			System.out.println("i/o error"+e);
		}
	}

}
