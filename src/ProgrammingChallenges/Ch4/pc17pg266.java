package ProgrammingChallenges.Ch4;
import java.util.Random;
import java.util.Scanner;

/*
- Write a program that generates a random number and asks the user to guess what the number is 

- If the user’s guess is higher than the random number, the program should display “Too high, try again” 

- If the user’s guess is lower than the random number, the program should display “Too low, try again” 

- The program should use a loop that repeats until the user correctly guesses the random number
*/

public class pc17pg266 {
	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		Random randomNumber = new Random();
		
		int randomNo, userGuess;
		
		do {
			randomNo = randomNumber.nextInt();
			System.out.print("\nWhat is the random number? ");
			userGuess = kbi.nextInt();
			
			if(userGuess > randomNo) {
				System.out.println("\n\tToo high, try again");
				System.out.println("\n\tyour guess: " + userGuess);
				System.out.println("\n\tthe random number: " + randomNo);
			}else {
				System.out.println("\n\tToo low, try again");
				System.out.println("\n\tyour guess: " + userGuess);
				System.out.println("\n\tthe random number: " + randomNo);
			}
		}while(userGuess != randomNo);
		
		System.out.println("congratulations! your guess is correct");
		
		kbi.close();
	}
}
