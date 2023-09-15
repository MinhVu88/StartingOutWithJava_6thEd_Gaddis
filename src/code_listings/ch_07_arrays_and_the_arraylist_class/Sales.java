package code_listings.ch_07_arrays_and_the_arraylist_class;
import javax.swing.JOptionPane;

// This program gathers sales amounts for the week. It uses the SalesData class to display the total, average, highest & lowest sales amounts

public class Sales {
	public static void main(String[] args) {
		final int ONE_WEEK = 7;
		
		double[] salesOneWeek = new double[ONE_WEEK];
		
		getDailySales(salesOneWeek); // get the week's sales figures
		
		SalesData week = new SalesData(salesOneWeek); // create a SalesData instance & pass salesOneWeek to its constructor as an argument
		
		JOptionPane.showMessageDialog(null, "the weekly total sales: $" + week.getTotal() + "\nthe weekly average sales: $" + week.getAverage()
										+ "\nthe weekly max amount of sales: $" + week.getMaxValue() + "\nthe weekly min amount of sales: $" + week.getMinValue());
		
		System.exit(0);
	}
	
	// this method asks user to enter the amount of sales for each day of the week
	public static void getDailySales(double[] week) {
		for(int day = 0; day < week.length; day++) {
			week[day] = Double.parseDouble(JOptionPane.showInputDialog("the sales for day " + (day + 1) + ":")); 
		}
	}
}
