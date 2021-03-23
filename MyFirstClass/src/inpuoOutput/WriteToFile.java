package inpuoOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

public class WriteToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedWriter  bw = null;
		BufferedReader br = null;
		String str = " ";
		
		try {
		
			File myFile = new File("D:\\html\\File5.txt");
			
			if (!myFile.exists()) {
				myFile.createNewFile();
			}
			System.out.println("enter the string to be stored \n ENTER END TO EXIT");
			br = new BufferedReader (new InputStreamReader(System.in));
			Writer writer = new FileWriter(myFile);
		    bw = new BufferedWriter(writer);
			
			while (!str.equals("end")) {
				str = br.readLine();
				if (!str.equals("end")) {
					bw.write(str);
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
			}catch (Exception e) {
				
			}
		}
	}

}
