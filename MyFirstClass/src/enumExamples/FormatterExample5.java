package enumExamples;

public class FormatterExample5 {

	static void stringFormatter() {
		String specifiers = "%-30s %-20s %-5.3f%n";
		String specifiers_s = "%-30s %-20s %-20s%n";
		System.out.printf(specifiers_s,"book title", "book author","book price");
		System.out.format(specifiers_s,"==========", "===========","==========");
		System.out.format(specifiers_s,"head first java", "kathy sierra","234.99f");
		System.out.format(specifiers_s,"thinking in java", "bruce ekel","300.69f");
		System.out.format(specifiers_s,"effective java", "joshua block","756.88f");
		
		
		
		
	}
	
	static void stringFormatter_1() {
		System.out.format("%20s %s %n", "full name:", "teena");
		System.out.format("%20s %s %n", "city:", "tvm");
		System.out.format("%20s %s %n", "county:", "india");
	}
	
		public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		stringFormatter();
		System.out.println("**********************");
		stringFormatter_1();
	}

}
