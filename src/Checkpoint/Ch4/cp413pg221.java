package Checkpoint.Ch4;
import javax.swing.JOptionPane;

/* Write a for loop that repeats 7 times, asking the user to enter a number
 * The loop should also calculate the sum of the numbers entered
 * */

public class cp413pg221 {
	public static void main(String[] args) {
		int input, sum = 0;
		
		input = Integer.parseInt(JOptionPane.showInputDialog("enter a number:"));
		
		for(int count = 1; count <= 7; count++) {
			input = Integer.parseInt(JOptionPane.showInputDialog("enter a number:"));
			sum += input;
		}
		
		JOptionPane.showMessageDialog(null, "the sum of the numbers entered: " + sum);
		
		System.exit(0);
	}
}
