package nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExplicitChannelWrite {

	public static void main(String[] args) {
		
        //obtain a channel to file within try-with-resources block
		try(FileChannel fChan = (FileChannel)Files.newByteChannel(
				Paths.get("D:\\java\\file2.txt"),
						StandardOpenOption.WRITE,
						StandardOpenOption.CREATE)) {
			//create buffer
			ByteBuffer mBuf =ByteBuffer.allocate(50);
			
			//write some bytes to the buffer
			for(int incr=0; incr<26; incr++) {
				mBuf.put((byte) ('A'+incr));
			}
			//changes position to start of the buffer
			mBuf.flip();
			
			//write the buffer to output file
			fChan.write(mBuf);
		} catch (InvalidPathException e) {
			System.out.println("path error " +e);
		} catch (IOException e) {
			System.out.println("i/o exception error" +e);
			System.exit(0);
		}
	}

}
