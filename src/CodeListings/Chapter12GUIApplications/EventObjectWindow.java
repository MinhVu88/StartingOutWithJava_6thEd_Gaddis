package CodeListings.Chapter12GUIApplications;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * the ActionEvent object's methods: getActionCommand & getSource

- getActionCommand() returns the action command that is associated with the event 

- When a JButton component generates an event, the action command is the text that appears on the button 

- The getActionCommand returns this text as a String 

- You can use the getActionCommand method to determine which button was clicked when several buttons share the same action listener class

- getSource() returns a reference to the component that is the source of the event 

- As with the getActionCommand method, if you have several buttons and use objects of the same action listener class to respond to their events, 
	you can use the getSource method to determine which button was clicked

- This program produces a window with 3 buttons: button1, button2 & button3

- The action listener class displays the contents of the event object’s action command when any of these buttons are clicked
*/

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class EventObjectWindow extends JFrame {
	private final int WINDOW_WIDTH = 350, WINDOW_HEIGHT = 100;
	
	private JButton button1, button2, button3;
	
	private JPanel panel;
	
	//create an event listener class as a private inner class for the buttons when they're clicked
	private class buttonListener implements ActionListener {
		/*
		// getSource()
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == "Button 1") {
				JOptionPane.showMessageDialog(null, "Button 1 was clicked");
			}else if(e.getSource() == "Button 2") {
				JOptionPane.showMessageDialog(null, "Button 2 was clicked");
			}else if(e.getSource() == "Button 3") {
				JOptionPane.showMessageDialog(null, "Button 3 was clicked");
			}
		}
		*/
		
		// getActionCommand()
		@Override
		public void actionPerformed(ActionEvent e) {
			// get the action command
			String actionCommand = e.getActionCommand();
			
			// determine which button was clicked & display a message
			switch (actionCommand) {
				case "Button 1":
					JOptionPane.showMessageDialog(null, "Button 1 was clicked");
					break;
				case "Button 2":
					JOptionPane.showMessageDialog(null, "Button 2 was clicked");
					break;
				case "Button 3":
					JOptionPane.showMessageDialog(null, "Button 3 was clicked");
					break;
				default:
					JOptionPane.showMessageDialog(null, "nothing was clicked");
					break;
			}			
		}
				
	}
	
	// a no-arg constructor
	public EventObjectWindow() {
		setTitle("Event Object Demonstration");
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button1 = new JButton("Button 1");
		
		button2 = new JButton("Button 2");
		
		button3 = new JButton("Button 3");
		
		button1.addActionListener(new buttonListener());
		
		button2.addActionListener(new buttonListener());
		
		button3.addActionListener(new buttonListener());
		
		panel = new JPanel();
		
		panel.add(button1);
		
		panel.add(button2);
		
		panel.add(button3);
		
		add(panel);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new EventObjectWindow();
	}

}
