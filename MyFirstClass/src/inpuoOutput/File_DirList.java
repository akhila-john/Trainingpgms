package inpuoOutput;

import java.io.File;

public class File_DirList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dirName = "C:\\test";
		File f1 = new File(dirName);
		if (f1.isDirectory()) {
			System.out.println("directory of "+ dirName);
			String str[] = f1.list();
			
			for (int incr =0; incr<str.length; incr++) {
				File file = new File(dirName +"//" +str[incr]);
				if (file.isDirectory()) {
					System.out.println(str[incr] + "is directory..");
				} else {
					System.out.println(str[incr] + "is a file..");
				}
			}
		} else {
			System.out.println(dirName + "is not a directory");
		}
	}

}
