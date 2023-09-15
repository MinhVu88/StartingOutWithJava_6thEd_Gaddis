/* cp 3.20 - pg.151: 
	- Assume the variable name references a String object. 
	- Write an if statement that displays “Do I know you?” if the String object contains “Timothy”.
*/

package checkpoints.ch3;
import javax.swing.JOptionPane;

public class CP320PG151 {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("what's your name? ");

		if(name.equals("Timothy")) {
			JOptionPane.showMessageDialog(null, "Do i know you?");
		}

		System.exit(0);
	}
}
