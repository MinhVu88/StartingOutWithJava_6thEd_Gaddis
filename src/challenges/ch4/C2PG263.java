package challenges.ch4;
import javax.swing.JOptionPane;

/* The distance a vehicle travels can be calculated as follows: Distance = Speed * Time

- For example, if a train travels 40 miles-per-hour for 3 hours, the distance traveled is 120 miles
 
- Write a program that asks for the speed of a vehicle (in miles-per-hour) & the number of hours it has traveled
 
- It should use a loop to display the distance a vehicle has traveled for each hour of a time period specified by the user
 
- For example, if a vehicle is traveling at 40 mph for a 3-hour time period, it should display a report similar to the one that follows:

Hour		Distance Traveled
------------------------------
1				40
2				80
3				120

Input Validation: Do not accept a negative number for speed & do not accept any value less than 1 for time traveled (negative number is not allowed in this program)

*/

public class C2PG263 {
	public static void main(String[] args) {
		int speed = Integer.parseInt(JOptionPane.showInputDialog("the speed (miles-per-hour):")),
			hoursTraveled = Integer.parseInt(JOptionPane.showInputDialog("the number of hours you've traveled:")),
			distance;
		
		while(speed < 1 || hoursTraveled < 1) {
			JOptionPane.showMessageDialog(null, "invalid value");
			speed = Integer.parseInt(JOptionPane.showInputDialog("the speed (miles-per-hour):"));
			hoursTraveled = Integer.parseInt(JOptionPane.showInputDialog("the number of hours you've traveled:"));
		}
		
		System.out.println("Hour                   Distance Traveled");
		System.out.println("------------------------------------------");
		
		for(int hour = 1; hour <= hoursTraveled; hour++) {
			System.out.print(hour + "                            ");
			distance = speed * hour;
			System.out.println(distance);
		}
		
		System.exit(0);
	}
}
