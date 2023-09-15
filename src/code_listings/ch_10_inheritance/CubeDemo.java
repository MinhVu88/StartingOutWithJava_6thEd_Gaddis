package code_listings.ch_10_inheritance;

// This program demonstrates passing arguments to a superclass constructor

import java.util.Scanner;

public class CubeDemo {

	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nthe cube's length: ");
		
		double length = kbi.nextDouble();
		
		System.out.print("\nthe cube's width: ");
		
		double width = kbi.nextDouble();
		
		System.out.print("\nthe cube's height: ");
		
		double height = kbi.nextDouble();
		
		Cube c = new Cube(length, width, height);
		
		c.display();
		
		kbi.close();
	}

}
