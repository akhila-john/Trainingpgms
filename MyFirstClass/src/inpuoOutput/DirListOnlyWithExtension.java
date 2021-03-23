package inpuoOutput;

import java.io.File;
import java.io.FilenameFilter;

public class DirListOnlyWithExtension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dirName = "D:\\quest programs";
		File f1 = new File(dirName);
		FilenameFilter fnf = new OnlyExtension(".java");
		String[] str = f1.list(fnf);
		
		for(int incr=0; incr<str.length; incr++) {
			System.out.println(str[incr]);
		}
	}

}
