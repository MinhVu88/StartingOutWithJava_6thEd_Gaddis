package challenges.ch4;
import javax.swing.JOptionPane;

/*
- Write a program that asks the user to enter the amount that he or she has budgeted for a month. 

- A loop should then prompt the user to enter each of his or her expenses for the month and keep a running total. 

- When the loop finishes, the program should display the amount that the user is over or under budget
*/

public class C16PG265 {
	public static void main(String[] args) {
		int monthlyBudget, weeklyExpenses, monthlyExpenses = 0, amountDifference;
		
		monthlyBudget = Integer.parseInt(JOptionPane.showInputDialog("enter the monthly budget (in U.S dollar):"));
		
		for(int week = 1; week <= 4; week++) {
			weeklyExpenses = Integer.parseInt(JOptionPane.showInputDialog("enter the weekly expenses for week " + week + " (in U.S dollar):"));
			monthlyExpenses += weeklyExpenses;
		}
		
		if(monthlyBudget > monthlyExpenses) {
			amountDifference = monthlyBudget - monthlyExpenses;
			JOptionPane.showMessageDialog(null, "the user is under budget");
			JOptionPane.showMessageDialog(null, "the amount that the user is under budget: $" + amountDifference);
		}else {
			amountDifference = monthlyExpenses - monthlyBudget;
			JOptionPane.showMessageDialog(null, "the user is over budget");
			JOptionPane.showMessageDialog(null, "the amount that the user is over budget: $" + amountDifference);
		}
		
		System.exit(0);
	}
}
