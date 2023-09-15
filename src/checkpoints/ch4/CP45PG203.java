package checkpoints.ch4;
import javax.swing.JOptionPane;

// Write an input validation loop that asks the user to enter �Y�, �y�, �N�, or �n�

public class CP45PG203 {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("will you still love me tomorrow? (Y/y/N/n)");
		char reply = input.charAt(0);
		boolean active = true;
		
		while(true) {
			if(reply == 'Y' || reply == 'y') {
				JOptionPane.showMessageDialog(null, "hell yeah baby");
				active = false;
			}else if(reply == 'N' || reply == 'n') {
				JOptionPane.showMessageDialog(null, "no way");
				active = false;
			}else {
				JOptionPane.showMessageDialog(null, "invalid input");
				active = false;
			}
		System.exit(0);
		}	
	}
}
