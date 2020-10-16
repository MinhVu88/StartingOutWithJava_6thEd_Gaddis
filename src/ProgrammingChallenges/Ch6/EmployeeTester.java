package ProgrammingChallenges.Ch6;
import java.util.Scanner;

public class EmployeeTester {
	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		/*
		// employee 1
		String emp1Name, emp1Department, emp1Job;
		int emp1Id;
		
		System.out.print("emp1 name: ");
		emp1Name = kbi.nextLine();
		
		System.out.println();
		
		System.out.print("emp1 id: ");
		emp1Id = kbi.nextInt();
		
		kbi.nextLine();
		System.out.println();
		
		System.out.print("emp1 department: ");
		emp1Department = kbi.nextLine();
		
		System.out.println();
		
		System.out.print("emp1 job: ");
		emp1Job = kbi.nextLine();
		
		Employee emp1 = new Employee(emp1Name, emp1Id, emp1Department, emp1Job);
		
		System.out.println();
		
		// employee 2
		String emp2Name;
		int emp2Id;
		
		System.out.print("emp2 name: ");
		emp2Name = kbi.nextLine();
		
		System.out.println();
		
		System.out.print("emp2 id: ");
		emp2Id = kbi.nextInt();
		
		Employee emp2 = new Employee(emp2Name, emp2Id);
		
		emp2.setDepartment("IT");
		emp2.setJob("Programmer");
		
		// employee 3
		Employee emp3 = new Employee();
		
		emp3.setName("Joy Rogers");
		emp3.setId(81774);
		emp3.setDepartment("Manufacturing");
		emp3.setJob("Engineer");
		
		System.out.println();
		
		// display the 3 employees
		System.out.println("name			ID number		department		job");
		System.out.println("----------------------------------------------------------------------------------------");
		
		System.out.println(emp1.getName() + "		" + emp1.getId() + "			" + emp1.getDepartment() + "		" + emp1.getJob());
		System.out.println(emp2.getName() + "		" + emp2.getId() + "			" + emp2.getDepartment() + "			" + emp2.getJob());
		System.out.println(emp3.getName() + "		" + emp3.getId() + "			" + emp3.getDepartment() + "		" + emp3.getJob());
		*/
		
		
		String name, department, job;
		int id;
		
		// employee 1 (constructor 1 - 4 parameter variables: name, department, id, job)
		System.out.print("emp1 name: ");
		name = kbi.nextLine();
		
		System.out.println();
		
		System.out.print("emp1 id: ");
		id = kbi.nextInt();
		
		kbi.nextLine();
		System.out.println();
		
		System.out.print("emp1 department: ");
		department = kbi.nextLine();
		
		System.out.println();
		
		System.out.print("emp1 job: ");
		job = kbi.nextLine();
		
		Employee emp1 = new Employee(name, id, department, job);
		
		System.out.println();
		
		// employee 2 (constructor 2 - 2 parameter variables: name, id)
		System.out.print("emp2 name: ");
		name = kbi.nextLine();
		
		System.out.println();
		
		
		System.out.print("emp2 id: ");
		id = kbi.nextInt();
		
		kbi.nextLine();
		System.out.println();
		
		
		Employee emp2 = new Employee(name, id);
		
		System.out.print("emp2 department: ");
		department = kbi.nextLine();
		emp2.setDepartment(department);
		
		System.out.println();
		
		System.out.print("emp2 job: ");
		job = kbi.nextLine();
		emp2.setJob(job);
		
		System.out.println();
		
		// employee 3 (the no-arg constructor)
		Employee emp3 = new Employee();
		
		System.out.print("emp3 name: ");
		name = kbi.nextLine();
		emp3.setName(name);
		
		System.out.println();
		
		System.out.print("emp3 id: ");
		id = kbi.nextInt();
		emp3.setId(id);
		
		kbi.nextLine();
		System.out.println();
		
		System.out.print("emp3 department: ");
		department = kbi.nextLine();
		emp3.setDepartment(department);
		
		System.out.println();
		
		System.out.print("emp3 job: ");
		job = kbi.nextLine();
		emp3.setJob(job);
		
		System.out.println();
		
		// display the 3 employees
		System.out.println("name			ID number		department		job");
		System.out.println("----------------------------------------------------------------------------------------");
		
		System.out.println(emp1.getName() + "		" + emp1.getId() + "			" + emp1.getDepartment() + "		" + emp1.getJob());
		System.out.println(emp2.getName() + "		" + emp2.getId() + "			" + emp2.getDepartment() + "			" + emp2.getJob());
		System.out.println(emp3.getName() + "		" + emp3.getId() + "			" + emp3.getDepartment() + "		" + emp3.getJob());
		
		
		kbi.close();
	}
}
