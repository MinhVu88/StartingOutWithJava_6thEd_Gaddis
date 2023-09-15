/* cp 3.22 - pg.151: 
	- Modify the statement you wrote in response to Checkpoint 3.20,
	  so it performs a case-insensitive comparison.
*/

package checkpoints.ch3;
import javax.swing.JOptionPane;

public class CP322PG151 {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("what's your name? ");

		if(name.equalsIgnoreCase("Timothy")) {
			JOptionPane.showMessageDialog(null, "Do i know you?");
		}else {
			JOptionPane.showMessageDialog(null, "Oh hi there");
		}
		
		System.exit(0);
	}
}
