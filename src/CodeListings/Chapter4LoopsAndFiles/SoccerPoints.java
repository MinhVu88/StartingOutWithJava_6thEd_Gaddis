package CodeListings.Chapter4LoopsAndFiles;
import javax.swing.JOptionPane;

/* This program calculates the total points earned by a soccer team over a series of games
 * It allows the user to enter the series of game points & then −1 (sentinel value) to signal the end of the list
 * The value −1 was chosen for the sentinel because it is impossible for a team to score negative points
 * Also note that the sentinel value is not included in the running total
 * */

public class SoccerPoints {
	public static void main(String[] args) {
		int gamePoints, totalPoints = 0; // totalPoints is the accumulator initialized to 0
		
		gamePoints = Integer.parseInt(JOptionPane.showInputDialog("enter your game points or enter -1 to show the total points:"));
		
		while(gamePoints != -1) {
			totalPoints += gamePoints;
			gamePoints = Integer.parseInt(JOptionPane.showInputDialog("enter your game points or enter -1 to show the total points:"));
		}
		
		JOptionPane.showMessageDialog(null, "the total points: " + totalPoints);
		
		System.exit(0);
	}
}
