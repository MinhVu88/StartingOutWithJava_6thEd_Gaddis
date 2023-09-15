/* cp 3.21 - pg.151: 
	- Assume the variables name1 and name2 reference two different String objects, 
	  containing different strings. 
	-	Write code that displays the strings referenced by these variables in alphabetical order.
*/

package checkpoints.ch3;
import javax.swing.JOptionPane;

public class CP321PG151 {
	public static void main(String[] args) {
		String name1 = JOptionPane.showInputDialog("name 1:"), 
					 name2 = JOptionPane.showInputDialog("name 2:");
		
		if(name1.compareToIgnoreCase(name2) < 0) {
			JOptionPane.showMessageDialog(null, "name 2: " + name2);
		} else if(name1.compareToIgnoreCase(name2) == 0) {
			JOptionPane.showMessageDialog(null, name1 + " = " + name2);
		} else if(name1.compareToIgnoreCase(name2) > 0) {
			JOptionPane.showMessageDialog(null, "name 1: " + name1);
		}

		System.exit(0);
	}
}
