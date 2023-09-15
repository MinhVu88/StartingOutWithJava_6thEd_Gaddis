package challenges.ch4;
import javax.swing.JOptionPane;

/*
- Write a program that uses nested loops to collect data & calculate the average rainfall over a period of years 

- First the program should ask for the number of years 

- The outer loop will iterate once for each year 

- The inner loop will iterate 12 times, once for each month

- Each iteration of the inner loop will ask the user for the inches of rainfall for that month

- After all iterations, the program should display the number of months, the total inches of rainfall & the average rainfall per month for the entire period

- Input Validation: 
		
		+ Do not accept a number less than 1 for the number of years. 
		
		+ Do not accept negative numbers for the monthly rainfall
*/

public class C8PG264 {
	public static void main(String[] args) {
		int years, eachMonth, totalMonths = 0, inchesPerMonth, inchesPerYear = 0, totalInches = 0;
		double averageRainfall;
		
		years = Integer.parseInt(JOptionPane.showInputDialog("the number of years:"));
		
		while(years < 1) {
			JOptionPane.showMessageDialog(null, "invalid value! please enter the number of years again");
			years = Integer.parseInt(JOptionPane.showInputDialog("the number of years:"));
		}
		
		for(int year = 1; year <= years; year++) {
			
			JOptionPane.showMessageDialog(null, "Year number " + year + ":");
			
			for(eachMonth = 1; eachMonth <= 12; eachMonth++) {
				inchesPerMonth = Integer.parseInt(JOptionPane.showInputDialog("the number of inches in month number " + eachMonth + ":"));
				
				while(inchesPerMonth < 0) {
					JOptionPane.showMessageDialog(null, "invalid value! please enter the number of monthly inches again");
					inchesPerMonth = Integer.parseInt(JOptionPane.showInputDialog("the number of inches in month number " + eachMonth + ":"));
				}
				
				inchesPerYear += inchesPerMonth;
			}
			totalMonths += eachMonth - 1;
			totalInches += inchesPerYear;
		}
		
		averageRainfall = (double)inchesPerYear / totalInches;
		
		JOptionPane.showMessageDialog(null, "the number of months: " + totalMonths);
		JOptionPane.showMessageDialog(null, "the total inches of rainfall: " + totalInches);
		JOptionPane.showMessageDialog(null, "the average rainfall per month for the entire period: " + averageRainfall);
		
		System.exit(0);
	}
}
