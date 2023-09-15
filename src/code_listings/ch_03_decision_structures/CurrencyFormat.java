package code_listings.ch_03_decision_structures;

// this program demonstrates how the comma separator & a precision of 2 decimal places can be used to format a number as a currency amount

public class CurrencyFormat {
	public static void main(String[] args) {
		double monthlyPay = 5000.0, annualPay = monthlyPay * 12;
		
		System.out.printf("the annual pay is $%,.2f\n", annualPay);
	}
}
