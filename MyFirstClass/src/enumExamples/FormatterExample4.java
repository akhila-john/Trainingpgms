package enumExamples;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatterExample4 {

	
	static void localeFormatterNonIndian() {
		long k=1000;
		long m = 1000000;
		long t = 1000000000;
		
		System.out.println("french locale");
		System.out.format(Locale.FRENCH, "ONE THOUSAND: %,d %n", k);
		System.out.format(Locale.FRENCH, "ONE million: %,d %n", m);
		System.out.format(Locale.FRENCH, "ONE dollar: %,d %n", t);
		
		System.out.println("german locale");
		System.out.format(Locale.GERMAN, "ONE THOUSAND: %,d %n", k);
		System.out.format(Locale.GERMAN, "ONE million: %,d %n", m);
		System.out.format(Locale.GERMAN, "ONE dollar: %,d %n", t);
		
		System.out.println("INDIAN locale");
		System.out.format(Locale.getDefault(), "ONE THOUSAND: %,d %n", k);
		System.out.format(Locale.getDefault(), "ONE million: %,d %n", m);
		System.out.format(Locale.getDefault(), "ONE dollar: %,d %n", t);
		
		System.out.println("default locale : indian");
		System.out.format( "ONE THOUSAND: %,d %n", k);
		System.out.format( "ONE million: %,d %n", m);
		System.out.format( "ONE dollar: %,d %n", t);
	}
	
	static void localeFormatterIndian() {
		long k= 1000;
		long m = 1000000;
		long t = 1000000000;
		
		NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
		String moneyString = formatter.format(k);
		String moneyString1 = formatter.format(m);
		String moneyString2 = formatter.format(t);
		System.out.println("one thousand: "+moneyString);
		System.out.println("one thousand: "+moneyString1);
		System.out.println("one thousand: "+moneyString2);
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		localeFormatterNonIndian();
		System.out.println("***********");
		localeFormatterIndian();
	}

}
