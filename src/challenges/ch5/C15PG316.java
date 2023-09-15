package challenges.ch5;
import java.util.Random;

/*
- You can use the following logic to determine whether a number is even or odd:

if ((number % 2) == 0) {
   // The number is even.
}else {
   // The number is odd.
}

- Write a program with a method named isEven that accepts an int argument 

- The method should return true if the argument is even or false otherwise 

- The program�s main method should use a loop to generate 100 random integers 

- It should use the isEven method to determine whether each random number is even or odd

- When the loop is finished, the program should display the number of even numbers that were generated & the number of odd numbers
*/

public class C15PG316 {
	public static void main(String[] args) {
		Random randomValues = new Random();
		
		int evenNos = 0, oddNos = 0, counter = 0;
		
		while(counter <= 99) {
			int num = randomValues.nextInt(counter);
			
			if(isEven(num)) {
				System.out.println("\n" + num + ": even");
				evenNos += num;
			}else {
				System.out.println("\n" + num + ": odd");
				oddNos += num;
			}
			
			counter++;
		}
		
		/*
		for(int no = 0; no <= 99; no++) {
			int num = randomValues.nextInt(no) + 1;
			
			if(isEven(num)) {
				System.out.println("\n" + num + " is an even number");
				evenNos += num;
			}else {
				System.out.println("\n" + num + " is an odd number");
				oddNos += num;
			}
		}
		*/
		System.out.println("\n-> even numbers: " + evenNos);
		System.out.println("\n-> odd numbers: " + oddNos);
	}
	
	public static boolean isEven(int val) {
		boolean evenNo = true;
		
		if(val % 2 == 0) {
			evenNo = true;
		}else {
			evenNo = false;
		}
		
		return evenNo;
	}
}
