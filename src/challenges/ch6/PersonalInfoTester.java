package challenges.ch6;
import java.util.Scanner;

public class PersonalInfoTester {
	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		String name, address, phoneNo;
		int age;
		
		// myself
		System.out.print("my name: ");
		name = kbi.nextLine();
		
		System.out.println();
		
		System.out.print("my address: ");
		address = kbi.nextLine();
		
		System.out.println();
		
		System.out.print("my phone number: ");
		phoneNo = kbi.nextLine();
		
		System.out.println();
		
		System.out.print("my age: ");
		age = kbi.nextInt();
		
		PersonalInfo myself = new PersonalInfo(name, address, phoneNo, age);
		
		kbi.nextLine();
		System.out.println();
		
		// friend 1
		PersonalInfo friend1 = new PersonalInfo();
		
		System.out.print("what's your name? ");
		name = kbi.nextLine();
		friend1.setName(name);
		
		System.out.println();
		
		System.out.print("what's your address? ");
		address = kbi.nextLine();
		friend1.setAddress(address);
		
		System.out.println();
		
		System.out.print("what's your phone no? ");
		phoneNo = kbi.nextLine();
		friend1.setPhoneNo(phoneNo);
		
		System.out.println();
		
		System.out.print("what's your age? ");
		age = kbi.nextInt();
		friend1.setAge(age);
		
		kbi.nextLine();
		System.out.println();
		
		// friend 2
		System.out.print("what's that person's age? ");
		age = kbi.nextInt();
		
		PersonalInfo friend2 = new PersonalInfo(age);
		
		kbi.nextLine();
		System.out.println();
		
		System.out.print("what's that person's name? ");
		name = kbi.nextLine();
		friend2.setName(name);
		
		System.out.println();
		
		System.out.print("what's that person's address? ");
		address = kbi.nextLine();
		friend2.setAddress(address);
		
		System.out.println();
		
		System.out.print("what's that person's phone no? ");
		phoneNo = kbi.nextLine();
		friend2.setPhoneNo(phoneNo);
		
		System.out.println();
		
		// display 3 people
		System.out.println("\ti'm " + myself.getName() + ", " + myself.getAge() + " years old . I live at " + myself.getAddress() + " & my phone no is " + myself.getPhoneNo());
		System.out.println("\n\ti'm " + friend1.getName() + ", a friend of " + myself.getName() + ". I'm " + friend1.getAge() + " years old. I live at " + friend1.getAddress() + " & my phone no is " + friend1.getPhoneNo());
		System.out.println("\n\thi i'm " + friend2.getName() + ". I'm a new friend of both " + myself.getName() + " & " + friend1.getName() + ". I'm " + friend2.getAge() + " years old. I live at " + friend2.getAddress() + " & my phone no is " + friend2.getPhoneNo());
		
		kbi.close();
	}
}
