package code_listings.ch_04_loops_and_files;
import javax.swing.JOptionPane;

/*
pseudocode:

- declare int vars: score1, score2, score3
- declare double var: average
- declare String userInput
- declare char reply
- enter the do-while loop
- prompt user to enter the values of 3 scores
- calculate the average of 3 scores
- prompt user if they want to average another set of scores
- get user reply
- validate the reply in the while loop's conditional test
+ if yes, back to the "do" part
+ if not, exit the loop 
*/

public class TestAverage1 {
	public static void main(String[] args) {
		int score1, score2, score3;
		double average;
		String userinput;
		char reply; // user response to whether he/she wants the program to keep running: Y/y/N/n 
		
		do {
			// get the scores
			score1 = Integer.parseInt(JOptionPane.showInputDialog("enter score 1: "));
			score2 = Integer.parseInt(JOptionPane.showInputDialog("enter score 2: "));
			score3 = Integer.parseInt(JOptionPane.showInputDialog("enter score 3: "));
			
			// calculate the average
			average = (score1 + score2 + score3) / 3;
			JOptionPane.showMessageDialog(null, "the average score: " + average);
			
			// get user reply
			userinput = JOptionPane.showInputDialog("wanna average another set of numbers? (Y/y/N/n): ");
			reply = userinput.charAt(0);
		}while(reply == 'y' || reply == 'Y');
		System.exit(0);		
	}
}
