package code_listings.ch_03_decision_structures;
import javax.swing.JOptionPane;

/* The program in CurrencyFormat2 can be simplified 

We can combine the steps of calling the String.format method & passing the value that it returns to the JOptionPane.showMessageDialog method 

This allows us to eliminate the declaration of the output variable
*/

public class CurrencyFormat3 {
	public static void main(String[] args) {
		double monthlyPay = 7000.0, annualPay = monthlyPay * 12;
		
		JOptionPane.showMessageDialog(null, String.format("your annual pay is $%,.2f", annualPay));
		
		System.exit(0);
	}
}
