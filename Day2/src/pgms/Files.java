package pgms;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class Files {

	public static void main(String[] args) {
		
		File file = new File("asset/test.txt");
		try {
		
			Scanner sc = new Scanner(file);
			int count = 0;
			while(sc.hasNextLine()) {
				String data = sc.nextLine();
				if (data.trim().length() > 0 && data.contains("INSERT")) {
					String[] result = data.split(" ");
					System.out.println(++count + " "+ result[5].replace(",", "") + " "+ result[1]);
				}
			}	
		}catch (FileNotFoundException e) {
			System.out.println("error occured");
			e.printStackTrace();
		}
		
	}
}
