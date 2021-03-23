package inpuoOutput;

import java.io.File;

public class FileDemo {
	
	public static void display(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		File f = new File("C:\\test");
		File f1 = new File(f,"Profile.docx");
		display("File Name :"+ f1.getName());
		display("path is :" +f1.getPath());
		display("path is :" +f1.getPath());
		display("Absolute path is" +f1.getAbsolutePath());
		display("parent is :"+f1.getParent());
		display(f1.exists() ? "Exists.." : "does not exists");
		display(f1.canWrite() ? "writable.." : "not writable");
		display(f1.canRead() ? "readable.." : "not readable");
		display(f1.isDirectory() ? "directory.." : " not directory");
		display(f1.isFile() ? "file." : "does not file");
		display(f1.isAbsolute() ? "ABSOLUTE.." : "does not ABSOLUTE");
		display("the file last modified :" +f1.lastModified());
		display("file sizee: " + f1.length() + "bytes");
		
	}

	

}
