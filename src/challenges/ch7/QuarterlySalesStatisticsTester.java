package challenges.ch7;

import java.util.Random;
import java.util.Scanner;

/*
- Write a program that lets the user enter 4 quarterly sales figures for 6 divisions of a company 

- The figures should be stored in a 2-dimensional array 

- Once the figures are entered, the program should display the following data for each quarter:

	� A list of the sales figures by division

	� Each division�s increase or decrease from the previous quarter (this will not be displayed for the 1st quarter)

	� The total sales for the quarter

	� The company�s increase or decrease from the previous quarter (this will not be displayed for the 1st quarter)

	� The average sales for all divisions that quarter

	� The division with the highest sales for that quarter

- Input Validation: Do not accept negative numbers for sales figures
*/

public class QuarterlySalesStatisticsTester {
	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		final int DIVISIONS = 6, QUARTERS = 4;
		
		System.out.println("\nThe following options are presented below:");
		
		System.out.println("\n\t1. A list of the sales figures by division" +
						   "\n\n\t2. Each division�s increase or decrease from the previous quarter (this won't be displayed for the 1st quarter)" +
						   "\n\n\t3. The total sales for the quarter" +
						   "\n\n\t4. The company�s increase or decrease from the previous quarter (this won't be displayed for the 1st quarter)" +
						   "\n\n\t5. The average sales for all divisions that quarter" +
						   "\n\n\t6. The division with the highest sales for that quarter");
		
		String reply = "";
		
		do {
			System.out.print("\nchoose your option: ");
			
			int option = kbi.nextInt();
			
			if(option == 1) {
				System.out.println("\n\t\t[ A list of the sales figures by division ]");
				
				Random randomNo = new Random();
				
				QuarterlySalesStatistics figures = new QuarterlySalesStatistics(randomNo);
				
				kbi.nextLine();
				
				System.out.print("\npick another option? (Y/y/N/n) ");
				
				reply = kbi.nextLine();
			}else if(option == 2) {
				
				
				
				kbi.nextLine();
				
				System.out.print("\n\npick another option? (Y/y/N/n) ");
				
				reply = kbi.nextLine();
			}else if(option == 3) {
				
			}else if(option == 4) {
				
			}else if(option == 5) {
				
			}else if(option == 6) {
				
			}
		} while (reply.equalsIgnoreCase("y"));
		
		kbi.close();
	}
}
