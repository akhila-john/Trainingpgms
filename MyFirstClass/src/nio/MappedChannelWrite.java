package nio;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MappedChannelWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(FileChannel fChan = (FileChannel) Files.newByteChannel(
				Paths.get("D:\\java\\file4.txt"),
				StandardOpenOption.WRITE,
				StandardOpenOption.READ,
				StandardOpenOption.CREATE)) {
			
			MappedByteBuffer mBuf = fChan.map(MapMode.READ_WRITE,0,26);
			
			//write some bytes to buffer
			for(int incr=0; incr<26; incr++) {
				mBuf.put((byte) ('A' + incr));
			}
		} catch (InvalidPathException e) {
			System.out.println("path error" +e);
			
		} catch (IOException e) {
			System.out.println("i/o exception.." +e);
		}
		
		
	}

}
