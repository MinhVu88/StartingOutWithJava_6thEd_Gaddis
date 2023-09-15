package challenges.ch4;
import java.util.Scanner;


/* 
- Write a program that calculates the amount a person would earn over a period of time 
if his or her salary is 1 penny the 1st day, 2 pennies the 2nd day & continues to double each day 

- The program should display a table showing the salary for each day & then show the total pay at the end of the period 

- The output should be displayed in a dollar amount, not the number of pennies (100 pennies = 1 dollar)

- Input Validation: Do not accept a number less than 1 for the number of days worked 
*/

public class C4PG263 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int penny = 1, dollar = 0, days;
		
		System.out.print("the number of days: ");
		 days = kb.nextInt();
		 
		 while(days < 1) {
			 System.out.println("invalid input");
			 System.out.print("the number of days: ");
			 days = kb.nextInt();
		 }
		 
		 System.out.println();
		 
		 System.out.println("Days                 Salary (pennies)");
		 System.out.println("----------------------------------");
		 
		 for(int day = 1; day <= days; day++) {
			 System.out.println(day + "                    " + penny);
			 dollar += penny; // 8 days: 1, 2+1, 4+2+1, 8+4+2+1, 16+8+4+2+1, 32+16+8+4+2+1, 64+32+16+8+4+2+1, 128+64+32+16+8+4+2+1 = 255
			 penny *= 2; // 8 days: 2, 4, 8, 16, 32, 64, 128
		 }
		
		 System.out.println("------------------------------------");
		 System.out.println("total (dollars):         $" + dollar/100.0);
		 
		 kb.close();
	}
}
