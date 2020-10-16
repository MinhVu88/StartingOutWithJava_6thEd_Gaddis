package ProgrammingChallenges.Ch6;
import java.util.Scanner;

public class PayrollTester {
	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		String name;
		int id, hours;
		double hourlyPay;
		
		System.out.print("employee name: ");
		name = kbi.nextLine();
		
		System.out.println();
		
		System.out.print("employee id: ");
		id = kbi.nextInt();
		
		Payroll emp = new Payroll(name, id);
		
		System.out.println();
		
		System.out.print("employee's working hours: ");
		hours = kbi.nextInt();
		emp.setHours(hours);
		
		System.out.println();
		
		System.out.print("employee's hourly pay rate: $");
		hourlyPay = kbi.nextDouble();
		emp.setHourlyPay(hourlyPay);
		
		// employee's gross pay
		System.out.println("\nemployee's gross pay: $" + emp.calculateGrossPay());
		
		kbi.close();
	}
}
