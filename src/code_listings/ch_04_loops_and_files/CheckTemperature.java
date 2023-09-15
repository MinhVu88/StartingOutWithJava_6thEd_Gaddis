package code_listings.ch_04_loops_and_files;
import javax.swing.JOptionPane;

/* pseudocode:
 
- temp must be checked every 15' => user is prompted to enter the temp

- if temp is below 102.5, every 15' check

- if temp is over 102.5:

    + thermostat must be turned down
    
    + wait 5 mins
    
    + check the temp again & again (user is prompted to enter the temp) until temp no longer exceeds 102.5
 */

public class CheckTemperature {
	public static void main(String[] args) {
		double temp = Double.parseDouble(JOptionPane.showInputDialog("enter the temp: ")); // get the current temp
		final double MAX_TEMP = 102.5;
		
		while (temp > MAX_TEMP) {
			JOptionPane.showMessageDialog(null, "the temp is too hot. plz turn down the thermostat 1st & then wait for 5 mins before checking the temp again");
			temp = Double.parseDouble(JOptionPane.showInputDialog("enter the temp: ")); // solution to prevent an infinite loop
		}
		
		JOptionPane.showMessageDialog(null, "the temp is now below 102.5 - plz check the temp every 15 mins to make sure it doesn't exceed that temp");
		
		System.exit(0);
	}

}
