package challenges.ch4;
import java.util.Random;
import java.lang.Math;

/*
- Write a program with a loop that lets the user enter a series of integers 
- The user should enter −99 to signal the end of the series 
- After all the numbers have been entered, the program should display the largest & smallest numbers entered 
*/

public class C10PG264 {
	public static void main(String[] args) {
		Random randomNo = new Random();
		
		int value_1, value_2, value_3;
		
		do {
			value_1 = randomNo.nextInt(198) - 99;
			System.out.print("\nvalue_1: " + value_1);
			
			System.out.println();
			
			value_2 = randomNo.nextInt(198) - 99;
			System.out.print("value_2: " + value_2);
			
			System.out.println();
			
			value_3 = randomNo.nextInt(198) - 99;
			System.out.print("value_3: " + value_3);
			
			System.out.println();
			
			System.out.println("\nthe max number between value_1 & value_2: " + Math.max(value_1, value_2));
			
			System.out.println("the max number between value_2 & value_3: " + Math.max(value_2, value_3));
			
			System.out.println("the max number between value_1 & value_3: " + Math.max(value_1, value_3));
			
			System.out.println("\nthe min number between value_1 & value_2: " + Math.min(value_1, value_2));
			
			System.out.println("the min number between value_2 & value_3: " + Math.min(value_2, value_3));
			
			System.out.println("the min number between value_1 & value_3: " + Math.min(value_1, value_3));
			
		}while(!(value_1 == -99 || value_2 ==-99 || value_3 == -99));
		
		System.out.println("\n\tone of the values is -99. So the program terminates the loop");
	}
}
