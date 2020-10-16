package CodeListings.Chapter12GUIApplications;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ColorWindow extends JFrame {

	private final int WINDOW_WIDTH = 330, WINDOW_HEIGHT = 100;
	
	private JLabel label;
	
	private JPanel panel;
	
	private JButton redButton, blueButton, yellowButton;
	
	// create event listeners classes for red, blue & yellow buttons
	private class redButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// set the panel's background to red & the label's text to blue
			panel.setBackground(Color.red);
			
			label.setForeground(Color.blue);
		}
		
	}
	
	private class blueButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// set the panel's background to blue & the label's text to yellow
			panel.setBackground(Color.blue);
			
			label.setForeground(Color.yellow);
		}
		
	}
	
	private class yellowButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// set the panel's background to yellow & the label's text to black
			panel.setBackground(Color.yellow);
			
			label.setForeground(Color.black);
		}
		
	}
	
	// a no-arg constructor
	public ColorWindow() {
		setTitle("Color Selector App");
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// create a label
		label = new JLabel("click the one of buttons to select a background color");
		
		// create the buttons & add/connect the event listener instances to them
		redButton = new JButton("red");
		
		blueButton = new JButton("blue");
		
		yellowButton = new JButton("yellow");
		
		redButton.addActionListener(new redButtonListener());
		
		blueButton.addActionListener(new blueButtonListener());
		
		yellowButton.addActionListener(new yellowButtonListener());
		
		// create a panel & add the components to it
		panel = new JPanel();
		
		panel.add(label);
		
		panel.add(redButton);
		
		panel.add(blueButton);
		
		panel.add(yellowButton);
		
		// add the panel to the jFrame instance's content pane
		add(panel);
		
		// display the window
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ColorWindow();
	}

}
