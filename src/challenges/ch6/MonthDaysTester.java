package challenges.ch6;
import javax.swing.JOptionPane;

public class MonthDaysTester {
	public static void main(String[] args) {
		int month = Integer.parseInt(JOptionPane.showInputDialog("month (1 - 12):"));
		
		int year = Integer.parseInt(JOptionPane.showInputDialog("year:"));
		
		MonthDays day = new MonthDays(month, year);
		
		JOptionPane.showMessageDialog(null, day.getNumberOfDays() + " days");
	}
}
