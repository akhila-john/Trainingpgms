package nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ExplicitChannelRead1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count;
		try(SeekableByteChannel sChan = Files.newByteChannel(
				Paths.get("D:\\java\\file1.txt"))){
			ByteBuffer nBuf = ByteBuffer.allocate(128);
			do {
				//reads bytes into the buffer a buffer
				count = sChan.read(nBuf);
				
				//stops the end of file reached
				if(count != -1) {
					//rewind the buffer so that it can be read
					nBuf.rewind();
					
					//read bytes from the buffer and show them on the screen asthe charcters
					for(int incr=0; incr<count; count++) {
						System.out.println((char)nBuf.get());
					} // end of loop
				}
			} while (count != -1);
			System.out.println();
		} catch (IOException e) {
			System.out.println("i/o Exception occured"+e);
		}
		
		
		
		}
	}


