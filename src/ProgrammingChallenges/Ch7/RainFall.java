package ProgrammingChallenges.Ch7;
import java.util.Scanner;

/*
- Write a RainFall class that stores the total rainfall for each of 12 months into an array of doubles 

- The program should have methods that return the following:

• the total rainfall for the year

• the average monthly rainfall

• the month with the most rain

• the month with the least rain

- Demonstrate the class in a complete program

- Input Validation: Do not accept negative numbers for monthly rainfall figures
*/

public class RainFall {

	public static void main(String[] args) {
		final int MONTH_SIZE = 12;
		
		double[] months = new double[MONTH_SIZE];
		
		double total = totalYearlyRainfall(months);
		
		double average = averageMonthlyRainfall(total);
		
		System.out.println("\n\tthe total rainfall for the year: " + total);
		
		System.out.println("\n\tthe average monthly rainfall: " + average);
	}
	
	private static double totalYearlyRainfall(double[] months) {
		double figures = 0.0;
		
		Scanner kbi = new Scanner(System.in);
		
		for(int index = 0; index < months.length; index++) {
			System.out.print("\nrainfall figures for month #" + (index + 1) + ": ");
			
			months[index] = kbi.nextDouble();
			
			while(months[index] < 0) {
				System.out.println("\n* invalid figures. plz try again");
				
				System.out.print("\nrainfall figures for month #" + (index + 1) + ": ");
				
				months[index] = kbi.nextDouble();
			}
			
			figures += months[index];
		}
		
		System.out.println("\n\tthe month with the most rain: " + mostRainyMonth(months));
		
		System.out.println("\n\tthe month with the least rain: " + leastRainyMonth(months));
		
		kbi.close();
		
		return figures;
	}
	
	private static double averageMonthlyRainfall(double yearlyFigures) {
		return yearlyFigures / 12;
	}
	
	private static int mostRainyMonth(double[] months) {
		double[] monthArray = new double[months.length];
		
		for(int index = 0; index < months.length; index++) {
			monthArray[index] = months[index];
		}
		
		double maxFigure = monthArray[0];
		
		int month = 0;
		
		for(int index = 1; index < monthArray.length; index++) {
			if(maxFigure < monthArray[index]) {
				maxFigure = monthArray[index];
				
				month = index + 1;
			}
		}
		
		return month;
	}
	
	private static int leastRainyMonth(double[] months) {
		double[] monthArray = new double[months.length];
		
		for(int index = 0; index < months.length; index++) {
			monthArray[index] = months[index];
		}
		
		double minFigure = monthArray[0];
		
		int month = 0;
		
		for(int index = 1; index < monthArray.length; index++) {
			if(minFigure > monthArray[index]) {
				minFigure = monthArray[index];
				
				month = index + 1;
			}
		}
		
		return month;
	}
}

