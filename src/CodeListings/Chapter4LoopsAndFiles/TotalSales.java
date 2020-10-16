package CodeListings.Chapter4LoopsAndFiles;
import javax.swing.JOptionPane;

// this program calculates a company’s total sales over a specific period of time by taking daily sales figures as input 
// & calculating a running total of them as they are gathered

public class TotalSales {
	public static void main(String[] args) {
		int days; // a specific period of time over which sales figures are calculated & accumulated
		double dailySales;
		double totalSales = 0.0; // a.k.a: an accumulator which is usually initialized to zero at the start of the program
		
		days = Integer.parseInt(JOptionPane.showInputDialog("The number of days over which sales figures are calculated:"));
		
		for(int count = 1; count <= days; count++) {
			dailySales = Double.parseDouble(JOptionPane.showInputDialog("the sales figures on day " + count + ":"));
			totalSales += dailySales; // daily sales figures are added to the total sales
		}
		
		JOptionPane.showMessageDialog(null, "The total sales: " + totalSales);
		
		System.exit(0);
	}
}
