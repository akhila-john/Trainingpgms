package awtprograms;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class TestFrame1 extends Frame {

	public static void main(String[] args) {
		
         //container
		TestFrame1 tf1 = new TestFrame1();
		
		//container
		Panel pan = new Panel();
		
		//component
		Label one = new Label("one",Label.LEFT);
		Label two = new Label("two",Label.CENTER);
		Label three = new Label("three",Label.RIGHT);
		
		//add component label to container panel
		pan.add(one); 
		pan.add(two);
		pan.add(three);
		
		//add panel to the frame tf1
		tf1.add(pan); 
		
		tf1.setSize(300,300);
		tf1.setTitle("my first frame");
		tf1.setVisible(true);
		
	}

}
