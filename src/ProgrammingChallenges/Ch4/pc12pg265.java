package ProgrammingChallenges.Ch4;
import java.util.Scanner;

/*
- Write a program that asks the user to enter today’s sales for 5 stores 
- The program should display a bar chart comparing each store’s sales 
- Create each bar in the bar chart by displaying a row of asterisks 
- Each asterisk should represent $100 of sales 
- Here is an example of the program’s output:

Enter today's sales for store 1: 1000 [Enter]
Enter today's sales for store 2: 1200 [Enter]
Enter today's sales for store 3: 1800 [Enter]
Enter today's sales for store 4: 800 [Enter]
Enter today's sales for store 5: 1900 [Enter]

SALES BAR CHART
Store 1: **********
Store 2: ************
Store 3: ******************
Store 4: ********
Store 5: *******************
*/

public class pc12pg265 {
	public static void main(String[] args) {
		int salesStore1, salesStore2, salesStore3, salesStore4, salesStore5, oneAsterisk = 100;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("today's sales for store 1: ");
		salesStore1 = kb.nextInt();
		int asterisks1 = salesStore1 / oneAsterisk;
		
		System.out.println();
		
		System.out.print("today's sales for store 2: ");
		salesStore2 = kb.nextInt();
		int asterisks2 = salesStore2 / oneAsterisk;
		
		System.out.println();
		
		System.out.print("today's sales for store 3: ");
		salesStore3 = kb.nextInt();
		int asterisks3 = salesStore3 / oneAsterisk;
		
		System.out.println();
		
		System.out.print("today's sales for store 4: ");
		salesStore4 = kb.nextInt();
		int asterisks4 = salesStore4 / oneAsterisk;
		
		System.out.println();
		
		System.out.print("today's sales for store 5: ");
		salesStore5 = kb.nextInt();
		int asterisks5 = salesStore5 / oneAsterisk;
		
		System.out.println();
		
		System.out.println("SALES BAR CHART");
		System.out.print("\nstore 1: ");
		for(int asterisk = 1; asterisk <= asterisks1; asterisk++) {
			System.out.print("*");
		}
		
		System.out.println();
		
		System.out.print("\nstore 2: ");
		for(int asterisk = 1; asterisk <= asterisks2; asterisk++) {
			System.out.print("*");
		}
		
		System.out.println();
		
		System.out.print("\nstore 3: ");
		for(int asterisk = 1; asterisk <= asterisks3; asterisk++) {
			System.out.print("*");
		}
		
		System.out.println();
		
		System.out.print("\nstore 4: ");
		for(int asterisk = 1; asterisk <= asterisks4; asterisk++) {
			System.out.print("*");
		}
		
		System.out.println();
		
		System.out.print("\nstore 5: ");
		for(int asterisk = 1; asterisk <= asterisks5; asterisk++) {
			System.out.print("*");
		}
		
		kb.close();
	}
}
