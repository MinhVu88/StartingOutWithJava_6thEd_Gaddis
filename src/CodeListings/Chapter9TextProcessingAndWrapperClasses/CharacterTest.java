package CodeListings.Chapter9TextProcessingAndWrapperClasses;
import javax.swing.JOptionPane;

// This program demonstrates some of the Character class's character testing methods

public class CharacterTest {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("enter any single character:");
		
		char ch = input.charAt(0);
		
		if(Character.isDigit(ch)) {
			JOptionPane.showMessageDialog(null, "the single character entered is a digit");
		} 
			
		if(Character.isLetter(ch)) {
			JOptionPane.showMessageDialog(null, "the single character entered is a letter");
		} 
			
		if(Character.isLetterOrDigit(ch)) {
			JOptionPane.showMessageDialog(null, "the single character entered is either a letter or a digit");
		} 
			
		if(Character.isLowerCase(ch)) {
			JOptionPane.showMessageDialog(null, "the single character entered is a lowercase letter");
		} 
			
		if(Character.isUpperCase(ch)) {
			JOptionPane.showMessageDialog(null, "the single character entered is an uppercase letter");
		} 
			
		if(Character.isSpaceChar(ch)) {
			JOptionPane.showMessageDialog(null, "the single character entered is a space");
		} 
			
		if(Character.isWhitespace(ch)) {
			JOptionPane.showMessageDialog(null, "the single character entered is a white space");
		}
		
		System.exit(0);
	}

}
