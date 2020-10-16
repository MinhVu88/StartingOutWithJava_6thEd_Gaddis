package Checkpoint.Ch4;
import javax.swing.JOptionPane;

// Write an input validation loop that asks the user to enter a number in the range of 10 through 24

public class cp44pg203 {
	public static void main(String[] args) {
		int no = Integer.parseInt(JOptionPane.showInputDialog("enter a number in the range of 10 & 24:"));
		while(no < 11 || no > 23) {
			JOptionPane.showMessageDialog(null, "the number must be between 10 & 24");
			no = Integer.parseInt(JOptionPane.showInputDialog("enter a number again:"));
		}
		JOptionPane.showMessageDialog(null, "the number: " + no);
		System.exit(0);
	}
}
