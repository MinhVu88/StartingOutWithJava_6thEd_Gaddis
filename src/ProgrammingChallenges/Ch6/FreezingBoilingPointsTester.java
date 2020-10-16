package ProgrammingChallenges.Ch6;
import java.util.Scanner;

public class FreezingBoilingPointsTester {

	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("enter a temperature: ");
		
		double temp = kbi.nextDouble();
		
		FreezingBoilingPoints t = new FreezingBoilingPoints();
		
		System.out.println("\nSubstances		Freezing Point		Boiling Point");
		
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("\nEthyl Alcohol		" + t.isEthylFreezing(temp) + "			" + t.isEthylBoiling(temp));
		
		System.out.println("\nOxygen			" + t.isOxygenFreezing(temp) + "			" + t.isOxygenBoiling(temp));
		
		System.out.println("\nWater			" + t.isWaterFreezing(temp) + "         		" + t.isWaterBoiling(temp));
		
		kbi.close();
	}

}
