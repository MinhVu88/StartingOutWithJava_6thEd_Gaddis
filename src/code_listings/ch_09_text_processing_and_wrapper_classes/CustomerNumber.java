package code_listings.ch_09_text_processing_and_wrapper_classes;
import javax.swing.JOptionPane;

public class CustomerNumber {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("enter a customer number in the format LLLNNNN (LLL = letters & NNNN = numbers):");
		
		if(isValid(input)) {
			JOptionPane.showMessageDialog(null, "valid number");
		}else {
			JOptionPane.showMessageDialog(null, "invalid number. The form is LLLNNNN (LLL = letters & NNNN = numbers). Ex: ABC1234/abc1234");
		}
		
		System.exit(0);
	}
	
	private static boolean isValid(String custNo) {
		boolean isValid = true;
		final int LENGTH = 7;
		int indexCounter = 0;
		
		if(custNo.length() != LENGTH) {
			isValid = false;
			
			JOptionPane.showMessageDialog(null, "the customer number must be 7-character long");
		}
		
		// are the 1st 3 characters letters?
		while(isValid && indexCounter < 3) {
			if(!Character.isLetter(custNo.charAt(indexCounter))) {
				isValid = false;				
			}
			
			indexCounter++;
		}
		
		// are the last 4 characters digits?
		while(isValid && indexCounter < LENGTH) {
			if(!Character.isDigit(custNo.charAt(indexCounter))) {
				isValid = false;
			}
			
			indexCounter++;
		}
		
		return isValid;
	}
}
