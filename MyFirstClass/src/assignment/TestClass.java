package assignment;

public class TestClass {

	public static void main(String[] args) {
	   TestSub tsub = new TestSub();
	   tsub.display(22,65);
	   tsub.display("quest", "global");
	   TestSuper ts = new TestSuper();
	  // ts.display(22,65);
	   ts.display("quest", "global");
	   TestSuper t = new TestSub();
	   //t.display(22,65);
	   t.display("quest", "global");
	   
	   
	   TestSub tsub1 = new TestSuper();
	   //tsub1.display(22,65);
	   //tsub1.display("quest", "global");
	}

}
