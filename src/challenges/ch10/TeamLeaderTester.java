package challenges.ch10;

import java.util.Scanner;

public class TeamLeaderTester {

	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.println("\n\t\tTeam leader #1:");
		
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
		
		System.out.print("\n- his/her fixed monthly bonus: $");
		
		double fixedMonthlyBonus = kbi.nextDouble();
		
		System.out.print("\n- his/her min training hours per year: ");
		
		int requiredYearlyTrainingHours = kbi.nextInt();
		
		System.out.print("\n- his/her attened training hours: ");
		
		int trainingHoursAttended = kbi.nextInt();
		
		TeamLeader wk1 = new TeamLeader();
		
		if(wk1.setNumber(number)) {
			System.out.println(new TeamLeader(name, number, date, shift, hourlyPayRate, fixedMonthlyBonus, requiredYearlyTrainingHours, trainingHoursAttended));
		}else {
			System.out.println("\n\t=> Invalid number! The format must be XXX�L, "
					+ "where each X is a digit within the range 0�9 & the L is a letter within the range A�M");
		}
		
		System.out.println("\n\t\tTeam leader #2:");
		
		TeamLeader wk2 = new TeamLeader();
		
		wk2.setName("Chad Lincoln");
		
		wk2.setNumber("671-h");
		
		wk2.setDate("05/03/2019");
		
		wk2.setShift(1);
		
		wk2.setHourlyPayRate(6.9);
		
		wk2.setFixedMonthlyBonus(23.7);
		
		wk2.setRequiredYearlyTrainingHours(48);
		
		wk2.setTrainingHoursAttended(13);
		
		System.out.println(wk2);
		
		kbi.close();
	}

}
