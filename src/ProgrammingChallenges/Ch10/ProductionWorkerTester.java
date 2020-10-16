package ProgrammingChallenges.Ch10;

import java.util.Scanner;

public class ProductionWorkerTester {

	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.println("\n\t\tProduction worker #1:");
		
		System.out.print("\n- name: ");
		
		String name = kbi.nextLine();
		
		System.out.print("\n- employee number (XXX-L): ");
		
		String number = kbi.nextLine();
		
		System.out.print("\n- the hire date (DD/MM/YYYY): ");
		
		String date = kbi.nextLine();
		
		System.out.print("\n- the shift (1: day & 2: night): ");
		
		int shift = kbi.nextInt();
		
		System.out.print("\n- the hourly pay rate: $");
		
		double hourlyPayRate = kbi.nextDouble();
		
		ProductionWorker pw1 = new ProductionWorker();
		
		if(pw1.setNumber(number)) {
			System.out.println(new ProductionWorker(name, number, date, shift, hourlyPayRate));
		}else {
			System.out.println("\n\t=> Invalid number! The format must be XXX–L, "
					+ "where each X is a digit within the range 0–9 & the L is a letter within the range A–M");
		}
		
		System.out.println("\n\t\tProduction worker #2:");
		
		ProductionWorker pw2 = new ProductionWorker();
		
		pw2.setName("Jim Huggins");
		
		pw2.setNumber("581-f");
		
		pw2.setDate("04/07/2018");
		
		pw2.setShift(2);
		
		pw2.setHourlyPayRate(7.5);
		
		System.out.println(pw2);
		
		kbi.close();
	}

}
