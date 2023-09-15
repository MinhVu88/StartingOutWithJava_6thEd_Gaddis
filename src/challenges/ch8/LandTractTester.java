package challenges.ch8;

import java.util.Scanner;

public class LandTractTester {

	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nthe length of tract 1: ");
		
		double length1 = kbi.nextDouble();
		
		System.out.print("\nthe width of tract 1: ");
		
		double width1 = kbi.nextDouble();
		
		LandTract tract1 = new LandTract(length1, width1);
		
		System.out.print(tract1);
		
		System.out.print("\n\nthe length of tract 2: ");
		
		double length2 = kbi.nextDouble();
		
		System.out.print("\nthe width of tract 2: ");
		
		double width2 = kbi.nextDouble();
		
		LandTract tract2 = new LandTract(length2, width2);
		
		System.out.println(tract2);
		
		if(tract1.equals(tract2)) {
			System.out.println("\n=> these 2 tracts are equal");
		}else {
			System.out.println("\n=> these 2 tracts are not equal");
		}
		
		kbi.close();
	}

}
