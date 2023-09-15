package code_listings.ch_03_decision_structures;
import javax.swing.JOptionPane;

// This program demonstrates how to use the String.format method to format a number as currency

public class CurrencyFormat2 {
	public static void main(String[] args) {
		double monthlyPay = 7000.0, annualPay = monthlyPay * 12;
		
		String output = String.format("your annual pay is $%,.2f", annualPay);
		
		JOptionPane.showMessageDialog(null, output);
		
		System.exit(0);
	}
}
