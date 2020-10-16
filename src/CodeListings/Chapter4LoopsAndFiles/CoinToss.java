package CodeListings.Chapter4LoopsAndFiles;
import javax.swing.JOptionPane; 
import java.util.Random;

/* description: 

- write a program to simulate 10 coin tosses, one after the other

- each time the program simulates a coin toss, it should randomly display either “Heads” or “Tails”

- simulate the tossing of a coin by randomly generating a number in the range of 0 through 1 

- write an if statement that displays “Tails” if the random number is 0 or “Heads” otherwise (0 = Tails & 1 = Heads)

- because the program should simulate 10 tosses of a coin, you decide to use a for loop
*/

/* pseudocode:

Repeat 10 times:
   If a random number in the range of 0 through 1 equals 0:
	  Display “Tails”
   Else:
	  Display “Heads”
*/

public class CoinToss {
	public static void main(String[] args) {
		Random randNo = new Random();
		
		for(int coinToss = 0; coinToss < 10; coinToss++) {
			if(randNo.nextInt(2) == 0) {
				JOptionPane.showMessageDialog(null, "Tails");
			}else {
				JOptionPane.showMessageDialog(null, "Heads");
			}
		}
		
		System.exit(0);
	}
}
