package ProgrammingChallenges.Ch5;
import java.util.Scanner;

/*
- In physics, an object that is in motion is said to have kinetic energy 

- The following formula can be used to determine a moving object’s kinetic energy: KE = ½ mv^2

+ KE: the kinetic energy 

+ m: the object’s mass in kilograms 

+ v: the object’s velocity in meters per second

- Write a method named kineticEnergy that accepts an object’s mass (in kilograms) & velocity (in meters per second) as arguments 

- The method should return the amount of kinetic energy that the object has 

- Demonstrate the method by calling it in a program that asks the user to enter values for mass & velocity
*/

public class pc12pg315 {
	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nthe object’s mass in kilograms: ");
		double massInKg = kbi.nextDouble();
		
		System.out.print("\nthe object’s velocity in meters per second: ");
		double velocityInMPS = kbi.nextDouble();
		
		System.out.println("\nthe amount of kinetic energy that the object has: " + calculateKineticEnergy(massInKg, velocityInMPS));
		
		kbi.close();
	}
	
	public static double calculateKineticEnergy(double m, double v) {
		double ke = (m * Math.pow(v, 2)) / 2;
		return ke;
	}
}
