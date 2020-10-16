package CodeListings.Chapter9TextProcessingAndWrapperClasses;
import javax.swing.JOptionPane;

// This program demonstrates the Character class's toUpperCase method

public class CircleArea {

	public static void main(String[] args) {
		double radius;
		
		String input;
		
		char reply;
		
		do {
			radius = Double.parseDouble(JOptionPane.showInputDialog("the circle's radius:"));
			
			JOptionPane.showMessageDialog(null, "the circle's area: " + Math.round((Math.PI * Math.pow(radius, 2.0))));
			
			input = JOptionPane.showInputDialog("again? (Y or N)");
			
			reply = input.charAt(0);
			
		}while(Character.toUpperCase(reply) == 'Y');
		
		System.exit(0);
	}

}
