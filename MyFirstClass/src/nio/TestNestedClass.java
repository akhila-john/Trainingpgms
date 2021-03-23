package nio;

import nio.OuterClass.InnerClass;

public class TestNestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("outer variable1 value is"+ OuterClass.OUTER_VARIABLE_1);
		System.out.println("outer variable2 value is"+OuterClass.OUTER_VARIABLE_2);
		
		
		
		System.out.println("inner variable1 value is"+ InnerClass.INNER_VARIABLE_1);
		System.out.println("INNER variable2 value is"+ InnerClass.INNER_VARIABLE_2);
		
	}

}
