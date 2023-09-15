package code_listings.ch_12_gui_applications;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KiloConverter extends JFrame {

	private final int WINDOW_WIDTH = 350, WINDOW_HEIGHT = 100;
	
	private JPanel panel;
	
	private JLabel label;
	
	private JTextField textField;
	
	private JButton button;
	
	// create an event listener class, named buttonListener, as the KiloConverter class's private inner class
	private class buttonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			final double CONVERSION = 0.6214;
			
			// get the text entered by user by calling the JTextField object's getText() method
			String input = textField.getText();
			
			// convert input into a double, multiply it by CONVERSION & display the result
			JOptionPane.showMessageDialog(null, input + " kilometers = " + (Double.parseDouble(input) * CONVERSION) + " miles");
		}
		
	}
	
	// create a panel
	private void buildPanel() {
		label = new JLabel("enter a distance in kilometers:");
		
		textField = new JTextField(10);
		
		button = new JButton("convert to miles");
		
		// add/connect an action listener object to the jButton component by calling button's addActionListener() method
		button.addActionListener(new buttonListener());
		
		panel = new JPanel();
		
		// add label, textField & button to panel
		panel.add(label);
		
		panel.add(textField);
		
		panel.add(button);
	}
	
	// a no-arg constructor
	public KiloConverter() {
		setTitle("Kilometer Converter App");
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// build the panel & add it to the jFrame object's content pane
		buildPanel();
		
		add(panel);
		
		// display the window
		setVisible(true);
	}

	public static void main(String[] args) {
		new KiloConverter();
	}

}
