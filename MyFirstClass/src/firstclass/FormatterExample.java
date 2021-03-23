package firstclass;

import java.util.Formatter;

public class FormatterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Formatter fmt =new Formatter();
		fmt.format("%s ******* %d %s %f", "Infosys Mysore",88, "karnataka",44.56);
		System.out.println(fmt.out());
	}

}
