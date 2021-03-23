package inpuoOutput;

import java.io.IOException;
public class FileInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size;
		try (FileInputStream  fin = new FileInputStream ("C:\\test\\file2.txt")) {
			System.out.println("total available bytes : "+(size = fin.available()));
			int no = size/40;
			System.out.println("first " + no +"bytes of the file one read() at a time");
			for(int incr = 0; incr<no; incr++) {
				System.out.println((char) fin.read());
			}
			System.out.println("\n still available bytes : " + fin.available());
			System.out.println("reading the next "+ no + "with one read(b[])");
			byte b[] =new byte[no];
			if (fin.read(b) != no) {
				System.out.println("couldnot read " + no +"bytes");
			}
			
			System.out.println(new String(b,0,no));
			System.out.println("\n still available " + (size = fin.available()));
			System.out.println("skipping half of remaining bytes with skip()");
			fin.skip(size/2);
			System.out.println("still available " + fin.available());
			
			System.out.println("reading" +no/2+ "into end of array");
			if (fin.read(b,no/2,no/2)!= no/2) {
				System.out.println("couldnot read " + no/2 +"bytes");
			}
			System.out.println(new String(b,0,b.length));
			System.out.println("\n still available " + (size = fin.available()));
			
				}catch (IOException e) {
					System.out.println("i/o error "+ e);
				}
	}

}
