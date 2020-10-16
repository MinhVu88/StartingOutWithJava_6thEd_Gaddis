package ProgrammingChallenges.Ch10;

import java.util.Scanner;

public class ShiftSupervisorTester {

	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.println("\n\t\tShift supervisor #1:");
		
		System.out.print("\n- name: ");
		
		String name = kbi.nextLine();
		
		System.out.print("\n- employee number (XXX-L): ");
		
		String number = kbi.nextLine();
		
		System.out.print("\n- the hire date (DD/MM/YYYY): ");
		
		String date = kbi.nextLine();
		
		System.out.print("\n- his/her annual salary: $");
		
		double annualSalary = kbi.nextDouble();
		
		System.out.print("\n- his/her yearly bonus: $");
		
		double yearlyBonus = kbi.nextDouble();
		
		ShiftSupervisor emp1 = new ShiftSupervisor();
		
		if(emp1.setNumber(number)) {
			System.out.println(new ShiftSupervisor(name, number, date, annualSalary, yearlyBonus));
		}else {
			System.out.println("\n\t=> Invalid number! The format must be XXX–L, "
					+ "where each X is a digit within the range 0–9 & the L is a letter within the range A–M");
		}
		
		System.out.println("\n\t\tShift supervisor #2:");
		
		ShiftSupervisor emp2 = new ShiftSupervisor();
		
		emp2.setName("Lester Holmes");
		
		emp2.setNumber("263-G");
		
		emp2.setDate("07/12/2017");
		
		emp2.setAnnualSalary(51.7);
		
		emp2.setYearlyBonus(23.9);
		
		System.out.println(emp2);
		
		kbi.close();
	}

}
