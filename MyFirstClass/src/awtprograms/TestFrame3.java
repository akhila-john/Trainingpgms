package awtprograms;

import java.awt.Component;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class TestFrame3  extends Frame {

	Panel pan;
	Label one;
	Label two;
	Label three;
	
	TestFrame3 () {
		setSize(300, 300); //set size of the frame
		setTitle("my second frame"); //set the title of frame
		setBounds(700, 300, 300, 300); //set the boundaries as where to display the frame
		setVisible(true); //making the frame visible
		
        		
		 one = new Label("one",Label.LEFT);
		 two = new Label("two",Label.CENTER);
	     three = new Label("three",Label.RIGHT);
		
		Panel pan = new Panel();
		pan.add(one);
		pan.add(two);
		pan.add(three);
		
		add(pan);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestFrame3 tf3 = new TestFrame3();
		
         
		
	}

}
