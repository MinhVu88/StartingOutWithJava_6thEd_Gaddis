package code_listings.ch_12_gui_applications;

import javax.swing.JFrame;

public class ShowWindow {

	public static void main(String[] args) {
		final int WINDOW_WIDTH = 350, WINDOW_HEIGHT = 250;
		
		JFrame window = new JFrame();
		
		window.setTitle("A SIMPLE WINDOW");
		
		window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		window.setVisible(true);
	}

}
