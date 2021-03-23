package awtprograms;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.FlowLayout;

public class TestButtonExamples1 extends Frame {
	
	TestButtonExamples1(String title) {
		super(title);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestButtonExamples1 tbe = new TestButtonExamples1("frame with buttons");
		
		Button b1 = new Button("one");
		Button b2 = new Button("two");
		Button b3 = new Button("three");
		Button b4 = new Button("four");
		Button b5 = new Button("five");
		
		// border layout
		/*tbe.add(b1,BorderLayout.EAST);
		tbe.add(b2,BorderLayout.WEST);
		tbe.add(b3,BorderLayout.NORTH);
		tbe.add(b4,BorderLayout.SOUTH);
		tbe.add(b5,BorderLayout.CENTER);*/
		
		
		//flow layout
		tbe.add(b1);
		tbe.add(b2);
		tbe.add(b3);
		tbe.add(b4);
		tbe.add(b5);
		
		tbe.setLayout(new FlowLayout());
		
		tbe.setBounds(700,300,300,300);
		tbe.setVisible(true);
	}

}
