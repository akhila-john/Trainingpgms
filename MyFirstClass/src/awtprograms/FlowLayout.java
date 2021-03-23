package awtprograms;

import java.awt.BorderLayout;
import java.awt.Button;

public class FlowLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FlowLayout fl = new FlowLayout();
		
		Button b1 = new Button("one");
		Button b2 = new Button("two");
		Button b3 = new Button("three");
		Button b4 = new Button("four");
		Button b5 = new Button("five");
		
		fl.add(b1);
		fl.add(b2);
		fl.add(b3);
		fl.add(b4);
		fl.add(b5);
		
		fl.setBounds(700,300,300,300);
		tbe.setVisible(true);
	}

}
