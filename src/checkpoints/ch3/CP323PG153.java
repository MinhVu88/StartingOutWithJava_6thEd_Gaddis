// cp 3.23 - pg.153: Rewrite the following if-else statements (a, b, c & d) as statements that use the conditional operator.
package checkpoints.ch3;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class CP323PG153 {
	public static void main(String[] args) {
		/* a) 
		if(x > y) {
			z = 1;
		} else {
			z = 20;
		}	
		*/
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("x: ")), 
				y = Integer.parseInt(JOptionPane.showInputDialog("y: ")), 
				z;
		
		JOptionPane.showMessageDialog(
			null,
			"z = " + (z = x > y ? 1 : 20)
		);

		/* b) 
		if(temp > 45) {
			population = base * 10;
	 	} else {
			population = base * 2;
		}		
		*/

		Scanner kb = new Scanner(System.in);
		int tempt, population, base;

		System.out.print("tempt: ");
		tempt = kb.nextInt();

		System.out.print("base: ");
		base = kb.nextInt();

		System.out.println("population: " + (population = tempt > 45 ? base * 10 : base * 2));

		System.out.println();

		/* c) 
		if(hours > 40) {
			wages *= 1.5;
		} else {
			wages *= 1;
		}		
		*/

		int hours;
		double wages;

		System.out.print("hours: ");
		hours = kb.nextInt();

		System.out.print("wages: ");
		wages = kb.nextDouble();

		System.out.println("wages: " + (wages = hours > 40 ? wages * 1.5 : wages * 1));

		System.out.println();

		/* d) 
		if(result >= 0) {
			System.out.println("The result is positive.");
		}	else {
			System.out.println("The result is negative.");
		}
		*/

		int result;

		System.out.print("enter the result: ");
		result = kb.nextInt();

		System.out.println("the result " + (result >= 0 ? "is positive" : "is negative"));
		
		kb.close();
		System.exit(0);
	}
}
