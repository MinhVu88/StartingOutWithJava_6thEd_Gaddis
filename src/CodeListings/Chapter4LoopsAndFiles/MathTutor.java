package CodeListings.Chapter4LoopsAndFiles;
import java.util.Scanner; 
import java.util.Random;

/* description: 
 
 - create 2 random numbers 
 - calculate their sum internally
 - ask the user to give his/her own answer 
 - compare the computational sum & human answer 
 - draw conclusion 
 */

public class MathTutor {
	public static void main(String[] args) {
		int no1, no2, sum, userAnswer;
		
		Scanner kb = new Scanner(System.in); // create a Scanner class instance, kb, for keyboard input
		
		Random randomNo = new Random(); // create a Random class instance, randomNo, for random values
		
		// get 2 random numbers
		no1 = randomNo.nextInt(100);
		no2 = randomNo.nextInt(200);
		
		System.out.print("what's the answer to " + no1 + " + " + no2 + "? -> ");
		sum = no1 + no2;
		
		// get the user's answer
		userAnswer = kb.nextInt();
		
		if(userAnswer == sum) {
			System.out.println("correct");
		}else {
			System.out.println("wrong! the correct answer is " + sum);
		}
		
		kb.close();
	}
}
