package CodeListings.Chapter5Methods;
import javax.swing.JOptionPane;

public class CreditCard {
	public static void main(String[] args) {
		double annualSalary; // must be over $10,000
		int creditRating;
		
		annualSalary = Double.parseDouble(JOptionPane.showInputDialog("your annual salary:"));
		
		creditRating = Integer.parseInt(JOptionPane.showInputDialog("your credit rating on the scale 1 thru 10 (below 5: disqualify - otherwise: qualify):"));
		
		if(annualSalary > 10000.00 && creditRating > 5) {
			qualify();
		}else {
			disqualify();
		}
	}
	
	public static void qualify() {
		JOptionPane.showMessageDialog(null, "you qualify for the credit card");
	}
	
	public static void disqualify() {
		JOptionPane.showMessageDialog(null, "you disqualify for the credit card");
	}
}
