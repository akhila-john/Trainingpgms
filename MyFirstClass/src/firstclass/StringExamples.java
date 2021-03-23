package firstclass;

public class StringExamples {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "whatsup";
		System.out.println("Stringlength is:"+s1.length());
		System.out.println("Stringlength is: "+s2.length());
		// TODO Auto-generated method stub

		String se1="hello";
		se1 = se1.concat("how are you");
		System.out.println("###################");
		System.out.println(se1);
		
		String sc1="hello how are you";
		System.out.println("###################");
		String replacechar=sc1.replace('h','t');
		System.out.println(replacechar);
		
		String sic1="HELLO";
		String sic2="hello";
		String sic3="hi";
		System.out.println("############");
		System.out.println(sic1.equals(sic2));
		System.out.println(sic1.equalsIgnoreCase(sic2));
		System.out.println(sic1.equalsIgnoreCase(sic3));
		
		String ss1="hello";
		String ss2="hello";
		String ss3="hemlo";
		
		System.out.println("###########");
		System.out.println(ss1.compareTo(ss2));
		System.out.println(ss1.compareTo(ss3));
		System.out.println(ss3.compareTo(ss1));
		
		String sL = "HOW ARE YOU";
		String s1lower=sL.toLowerCase();
		System.out.println("##########");
		System.out.println(s1lower);
		
		String sr1="Hey,welcome to Quest";
		String replaceString=sr1.replace("Quest", "TCS");
		System.out.println("##########");
		System.out.println(replaceString);
		
		String name="hello how are you doing";
		System.out.println("###########");
		System.out.println(name.contains("how are you"));
		System.out.println(name.contains("hello"));
		System.out.println(name.contains("fine"));
		
		}
     }



