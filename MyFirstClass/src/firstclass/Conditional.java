package firstclass;

public  class Conditional {
	void whileEx() {
		int var1 = 1;
		System.out.println("While loop");
		while (var1<10) {
			System.out.println(var1);
			var1++;
		
		}
	}
	void doWhileEx() {
		int var1 = 1;
		System.out.println("do..while");
		do {
			System.out.println(var1);
		var1++;
	} while (var1< 10);
	}
	void forEx() {
		System.out.println("for loop..");
		for(int var1 = 0; var1 < 10; var1++) {
			System.out.println(var1);
			
		}
			}
	


	public static void main(String[] args) {
		Conditional we =  new Conditional ();
		we.whileEx ();
		we.doWhileEx();
		we.forEx ();
		
		// TODO Auto-generated method stub

	}

}
