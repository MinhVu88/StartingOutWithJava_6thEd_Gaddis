package challenges.ch8;

import java.util.Scanner;

public class AreaTester {

	public static void main(String[] args) {
		System.out.print("\nthe circle's radius: ");
		
		Scanner kbi = new Scanner(System.in);
		
		double circleRadius = kbi.nextDouble();
		
		System.out.println("\n\t-> the circle's area: " + Area.area(circleRadius));
		
		System.out.print("\nthe rectangle's width: ");
		
		int width = kbi.nextInt();
		
		System.out.print("\nthe rectangle's length: ");
		
		int length = kbi.nextInt();
		
		System.out.println("\n\t-> the rectangle's area: " + Area.area(width, length));
		
		System.out.print("\nthe cylinder's radius: ");
		
		double cylinderRadius = kbi.nextDouble();
		
		System.out.print("\nthe cylinder's height: ");
		
		double cylinderHeight = kbi.nextDouble();
		
		System.out.println("\n\t-> the cylinder's area: " + Area.area(cylinderRadius, cylinderHeight));
		
		kbi.close();
	}

}
