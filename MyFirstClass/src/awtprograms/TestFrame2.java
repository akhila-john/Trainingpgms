package awtprograms;

import java.awt.Frame;

public class TestFrame2 extends Frame {
	
	//using constructor creating a frame
	TestFrame2 () {
		setSize(300, 300); //set size of the frame
		setTitle("my second frame"); //set the title of frame
		setBounds(700, 300, 300, 300); //set the boundaries as where to display the frame
		setVisible(true); //making the frame visible
	}

	public static void main(String[] args) {
		TestFrame2 tf2 = new TestFrame2();
	}

}
