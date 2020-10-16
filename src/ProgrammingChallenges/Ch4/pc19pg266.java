package ProgrammingChallenges.Ch4;
import java.util.Scanner;
import java.util.Random;

/*
- Write a program that tests your ESP (extrasensory perception) 

- The program should randomly select the name of a color from the following list of words: Red, Green, Blue, Orange, Yellow

- To select a word, the program can generate a random number 

- For example, if the number is 0, the selected word is Red, if the number is 1, the selected word is Green and so forth

- Next, the program should ask the user to enter the color that the computer has selected

- After the user has entered his or her guess, the program should display the name of the randomly selected color 

- The program should repeat this 10 times and then display the number of times the user correctly guessed the selected color
*/

public class pc19pg266 {
	public static void main(String[] args) {
		Random randomNumber = new Random();
		Scanner kbi = new Scanner(System.in);
		
		int correctGuesses = 0, totalCorrectGuesses = 0, userGuesses;
		String computerColors = "", userColors = "";
		
		System.out.println("\n* There are 5 colors the computer can generate: red, green, blue, orange & yellow. Each number between 0 & 4 represents a color\n");
		System.out.println("* You have 10 times to pick a number that corresponds to the randomly computer-generated color\n");
		System.out.println("* If your guess is correct, you'll be given the name of the randomly selected color & the total correct guesses you made\n");
		System.out.println("* If not, you'll be notified of the false answer\n");
		System.out.println("* REMEMBER: \n" + "\n0 - RED" + "\n1 - GREEN" + "\n2 - BLUE" + "\n3 - ORANGE" + "\n4 - YELLOW");
		
		for(int round = 1; round < 11; round++) {
			int computerGeneratedRandomNo = randomNumber.nextInt(5);
			
			if(computerGeneratedRandomNo == 0) {
				computerColors = "red";
			}else if (computerGeneratedRandomNo == 1) {
				computerColors = "green";
			}else if(computerGeneratedRandomNo == 2) {
				computerColors = "blue";
			}else if (computerGeneratedRandomNo == 3) {
				computerColors = "orange";
			}else if (computerGeneratedRandomNo == 4) {
				computerColors = "yellow";
			}

			System.out.print("\nround " + round + " (pick a number between 0 & 4): ");
			userGuesses = kbi.nextInt();
			
			if(userGuesses == 0) {
				userColors = "red";
			}else if (userGuesses == 1) {
				userColors = "green";
			}else if (userGuesses == 2) {
				userColors = "blue";
			}else if (userGuesses == 3) {
				userColors = "orange";
			}else if (userGuesses == 4) {
				userColors = "yellow";
			}
			
			if(computerGeneratedRandomNo == userGuesses) {
				System.out.println("\n\tCORRECT!");
				System.out.println("\n\t\t- the randomly computer-generated color: " + computerColors);
				System.out.println("\n\t\t- your guess: " + userColors);
				correctGuesses++;
				totalCorrectGuesses =+ correctGuesses;
				System.out.println("\n\t\t- the current number of correct guesses: " + totalCorrectGuesses);
			}else {
				System.out.println("\n\tMISMATCH!");
				System.out.println("\n\t\t- the randomly computer-generated color: " + computerColors);
				System.out.println("\n\t\t- your guess: " + userColors);
			}
		}
		System.out.println("\nthe total correct guesses: " + totalCorrectGuesses);
		kbi.close();
	}
}
