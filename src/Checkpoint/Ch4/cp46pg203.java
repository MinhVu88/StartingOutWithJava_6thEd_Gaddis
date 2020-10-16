package Checkpoint.Ch4;
import javax.swing.JOptionPane;

// Write an input validation loop that asks the user to enter “Yes” or “No”

public class cp46pg203 {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("will you still love me tomorrow? (YES/yes/NO/no)");
		boolean active = true;
		
		while(active) {
			if(input.equalsIgnoreCase("YES") || input.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "forever & ever honey");
				active = false;
			}else {
				JOptionPane.showMessageDialog(null, "no fucking way");
				active = false;
			}
		}
		System.exit(0);
	}
}
