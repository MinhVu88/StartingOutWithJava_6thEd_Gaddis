package code_listings.ch_12_gui_applications;

import javax.swing.JFrame;

public class EmbeddedMain extends JFrame {
	
	final int WINDOW_WIDTH = 350, WINDOW_HEIGHT = 250;
	
	// a no-arg constructor
	public EmbeddedMain() {
		setTitle("A SIMPLE WINDOW");
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// version 1:
		// instantiate the EmbeddedMain class thru the declaration of em, which won't be used again once the instance is created
		// EmbeddedMain em = new EmbeddedMain();
		
		// version 2:
		// instantiate the EmbeddedMain class anonymously & its memory address isn't assigned to any reference variable
		new EmbeddedMain();
	}

}
