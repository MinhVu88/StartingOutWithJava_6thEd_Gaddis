package CodeListings.Chapter5Methods;
import javax.swing.JOptionPane;

/* description:

- Mike runs a catering company & some of the ingredients that his recipes require are measured in cups 
- When he goes to the grocery store to buy those ingredients, however, they are sold only by the fluid ounce 
- He has asked you to write a simple program that converts cups to fluid ounces

You design the following algorithm:

1. Get the number of cups from the user

2. Convert the number of cups to fluid ounces

3. Display the result.

- This algorithm lists the top level of tasks that the program needs to perform & becomes the basis of the class’s main method 
- The class will also have the following methods:

• getCups will prompt the user to enter the number of cups & then return that value as a double

• cupsToOunces will accept the number of cups as an argument & then return the equivalent number of fluid ounces as a double

• displayResults displays a message indicating the results of the conversion
*/

public class CupConverter {
	public static void main(String[] args) {
		double cups = getNumberOfCups();
		
		double ounces = convertCupsToOunces(cups);
		
		displayResults(cups, ounces);
		
		System.exit(0);
	}
	
	public static double getNumberOfCups() {
		double cups = Double.parseDouble(JOptionPane.showInputDialog("Note: 1 cup = 8 fluid ounces. Enter the number of cups:"));
		return cups;
	}
	
	public static double convertCupsToOunces(double cups) {
		return cups * 8.0;
	}
	
	public static void displayResults(double cups, double ounces) {
		JOptionPane.showMessageDialog(null, cups + " cups equals " + ounces + " fluid ounces");
	}
}
