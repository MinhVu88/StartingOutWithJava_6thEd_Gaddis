package code_listings.ch_12_gui_applications;

import javax.swing.JFrame;

public class SimpleWindow extends JFrame {
	
	// a no-arg constructor
	public SimpleWindow() {
		final int WINDOW_WIDTH = 350, WINDOW_HEIGHT = 250;
		
		setTitle("A SIMPLE WINDOW");
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}
}
