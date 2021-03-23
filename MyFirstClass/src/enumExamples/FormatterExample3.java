package enumExamples;

import java.util.Arrays;
import java.util.List;

public class FormatterExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str[] = {"head first java", "effective java","the passionate programmer",
				"headfirst design" };
		
		List<String> listBook = Arrays.asList(str);
		
		//left justify the strings with width of 30 characters
		for (String book : listBook) {
			System.out.printf("-30s- in stock %10d in", book, 245);
		}
		}
	}


