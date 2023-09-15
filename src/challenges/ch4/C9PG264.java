package challenges.ch4;
import java.util.Scanner;

/*
- Write a program that will predict the size of a population of organisms 

- The program should ask for the starting number of organisms, their average daily population increase (as a percentage) & the number of days they will multiply 

- For example, a population might begin with 2 organisms, have an average daily increase of 50 percent & will be allowed to multiply for 7 days 

- The program should use a loop to display the size of the population for each day

- Input Validation: 
	
	+ Do not accept a number less than 2 for the starting size of the population

	+ Do not accept a negative number for average daily population increase 
	
	+ Do not accept a number less than 1 for the number of days they will multiply
*/

public class C9PG264 {
	public static void main(String[] args) throws Exception {
		Scanner kbi = new Scanner(System.in);
		
		int days;
		double startingNumberOfOrganisms, averageDailyPopulationIncreasePercentage, dailyPopulationIncrease = 0;
		
		System.out.print("\nthe number of days they will multiply: ");
		days = kbi.nextInt();
		
		while(days < 1) {
			System.out.println("\n\tinvalid input! Do not accept a number less than 1 for the number of days they will multiply");
			System.out.print("\tthe number of days they will multiply: ");
			days = kbi.nextInt();
		}
		
		System.out.print("\nthe starting number of organisms: ");
		startingNumberOfOrganisms = kbi.nextDouble();
		
		while(startingNumberOfOrganisms < 2) {
			System.out.println("\n\tinvalid input! Do not accept a number less than 2 for the starting size of the population");
			System.out.print("\tthe starting number of organisms: ");
			startingNumberOfOrganisms = kbi.nextDouble();
		}
		
		System.out.print("\nthe average daily population increase (as a percentage): ");
		averageDailyPopulationIncreasePercentage = kbi.nextDouble();
		
		while(averageDailyPopulationIncreasePercentage < 0) {
			System.out.println("\n\tinvalid input! Do not accept a negative number for average daily population increase");
			System.out.print("\tthe average daily population increase (as a percentage): ");
			averageDailyPopulationIncreasePercentage = kbi.nextDouble();
		}
		
		System.out.println();
		
		System.out.println("Days             Daily Population                   Increment percentage");
		System.out.println("---------------------------------------------------------------------");
		System.out.println();
		System.out.println("1                   2.0                                 " + averageDailyPopulationIncreasePercentage / 100.0 + " %");
		
		// the starting number of organisms is added to the daily population increase 
		// because it's the daily population that is increased continuously, based on the % of daily increment, throughout the days specified, not the starting number
		// the starting number of organisms, which is initialized by the user, stays the same throughout the process
		dailyPopulationIncrease += startingNumberOfOrganisms;
		
		for(int day = 2; day <= days; day++) {
			System.out.print(day + "         ");
			
			// the expression (dailyPopulationIncrease * (averagePoplationIncreasePercentage / 100.0))) calculates the actual value of the increment percentage each day
			// then that value is added to the daily population increment (an accumulator) 
			dailyPopulationIncrease += (dailyPopulationIncrease * (averageDailyPopulationIncreasePercentage / 100.0));
			
			System.out.println("          " + dailyPopulationIncrease + "                                  " + averageDailyPopulationIncreasePercentage / 100.0 + " %");
		}
		
		kbi.close();
	}
}
