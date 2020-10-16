package CodeListings.Chapter8A2ndLookAtClassesAndObjects;
import javax.swing.JOptionPane;

// the program demonstrates the Metric class's static methods

public class MetricDemo {

	public static void main(String[] args) {
		double miles, km;
		
		miles = Double.parseDouble(JOptionPane.showInputDialog("enter a distance in miles:"));
		
		km = Metric.milesToKm(miles); // call the static method directly from the class
		
		JOptionPane.showMessageDialog(null, miles + " miles: " + km + " km");
		
		km = Double.parseDouble(JOptionPane.showInputDialog("enter a distance in km:"));
		
		miles = Metric.kmToMiles(km); // call another static method directly from the class
		
		JOptionPane.showMessageDialog(null, km + " km: " + miles + " miles");
		
		System.exit(0);
	}

}
