package firstclass;

public class SwitchCaseExample {
	void SwitchCaseExample () {
		int arg1;
		arg1 = 3;
		switch (arg1) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wedesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid");
			break;
			
}
	}


	public static void main(String[] args) {
		SwitchCaseExample sce = new SwitchCaseExample();
	    sce.SwitchCaseExample ();
	    
		// TODO Auto-generated method stub

	}

}
