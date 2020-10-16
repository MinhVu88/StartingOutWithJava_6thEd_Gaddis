package ProgrammingChallenges.Ch7;

import java.util.Scanner;

public class PayrollTester {

	public static void main(String[] args) {
		final int EMPLOYEE_QUANTITY = 7;
		
		int[] IDs = new int[EMPLOYEE_QUANTITY];
		
		showIDs(IDs);
	}
	
	public static void showIDs(int[] empIDs) {
		Scanner kbi = new Scanner(System.in);
		
		final int HOURS = 7, PAY_RATE = 7, GROSS_WAGES = 7;
		
		Payroll emp = new Payroll();
		
		emp.setEmployeeId(new int[] {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489});
		
		emp.setHours(new int[HOURS]);
		
		emp.setPayRate(new double[PAY_RATE]);
		
		emp.setGrossWages(new double[GROSS_WAGES]);
		
		for(int index = 0; index < emp.getEmployeeId().length; index++) {
			
			System.out.print("\nemp #" + (index + 1) + " (id: " + emp.getEmployeeId()[index] + "):");
			
			System.out.print("\n\t- the working hours: ");
				
			emp.getHours()[index] = kbi.nextInt();
				
			System.out.print("\n\t- the pay rate: $");
				
			emp.getPayRate()[index] = kbi.nextDouble();
			
			while(emp.getGrossWages(emp.getEmployeeId()[index]) < 0 || emp.getPayRate()[index] < 6.00) {
				System.out.println("\n\t\t* invalid result. plz try again");
				
				System.out.print("\n\t- the working hours: ");
				
				emp.getHours()[index] = kbi.nextInt();
					
				System.out.print("\n\t- the pay rate: $");
					
				emp.getPayRate()[index] = kbi.nextDouble();
			}
				
			System.out.println("\n\t\t-> the gross wages: $" + emp.getGrossWages(emp.getEmployeeId()[index]));
			
		}
		
		kbi.close();
	}
}
