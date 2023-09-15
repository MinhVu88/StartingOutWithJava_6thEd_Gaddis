package challenges.ch5;
import java.util.Scanner;

/*
- Write a program that asks the user to enter a distance in meters. The program will then present the following menu of selections:

1. Convert to kilometers
2. Convert to inches
3. Convert to feet
4. Quit the program

- The program will convert the distance to kilometers, inches or feet, depending on the user�s selection. Here are the specific requirements:

� Write a void method named showKilometers, which accepts the number of meters as an argument. 

	+ The method should display the argument converted to kilometers. 
	
	+ Convert the meters to kilometers using the following formula: kilometers = meters * 0.001

� Write a void method named showInches, which accepts the number of meters as an argument. 

	+ The method should display the argument converted to inches. 
	
	+ Convert the meters to inches using the following formula: inches = meters * 39.37
	
� Write a void method named showFeet, which accepts the number of meters as an argument. 

	+ The method should display the argument converted to feet. 
	
	+ Convert the meters to feet using the following formula: feet = meters * 3.281
	
� Write a void method named menu that displays the menu of selections. 

	+ This method should not accept any arguments.
	
� The program should continue to display the menu until the user enters 4 to quit the program.

� The program should not accept negative numbers for the distance in meters.

� If the user selects an invalid choice from the menu, the program should display an error message.

- Here is an example session with the program, using console input. 

Enter a distance in meters: 500 [Enter]
1. Convert to kilometers
2. Convert to inches
3. Convert to feet
4. Quit the program

Enter your choice: 1 [Enter]
500 meters is 0.5 kilometers.
1. Convert to kilometers
2. Convert to inches
3. Convert to feet
4. Quit the program

Enter your choice: 3 [Enter]
500 meters is 1640.5 feet.
1. Convert to kilometers
2. Convert to inches
3. Convert to feet
4. Quit the program

Enter your choice: 4 [Enter]
Bye!
*/

public class C8PG314 {
	public static void main(String[] args) {
		Scanner kbi_0 = new Scanner(System.in);
		Scanner kbi_1 = new Scanner(System.in);
		
		System.out.print("\nenter a distance in meters: ");
		double meters = kbi_0.nextDouble();
		
		/*
		// wrong
		int choice;
		
		boolean quit = true;
		
		if(meters >= 0) {
			do {
				displaySelections();
				
				System.out.print("\nenter your choice: ");
				choice = kbi_1.nextInt();
				
				switch (choice) {
					case 1:
						showKilometers(meters);
						//displaySelections();
						quit = false;
					break;
					case 2:
						showInches(meters);
						//displaySelections();
						quit = false;
					break;
					case 3:
						showFeet(meters);
						//displaySelections();
						quit = false;
					break;
					case 4:
						System.out.println("\nquit the program. Bye!");
						quit = true;
					break;
					default:
						System.out.println("\n* invalid choice. Plz choose again");
						displaySelections();
						System.out.print("enter your choice: ");
						choice = kbi_1.nextInt();
						quit = false;
					break;
				}
				
			}while(!quit);
		}else {
			System.out.println("\ninvalid value. Plz try again");
			System.out.print("\nenter a distance in meters: ");
			meters = kbi_0.nextDouble();
			quit = false;
		}
		*/
		
		
		int choice;
		
		boolean quit = true;
		
		while(meters < 0) {
			System.out.println("\ninvalid value. Plz try again");
			System.out.print("\nenter a distance in meters: ");
			meters = kbi_0.nextDouble();
		}
			
		displaySelections();
			
		do {
			System.out.print("enter your choice: ");
			choice = kbi_1.nextInt();
			
			/*
			switch (choice) {
				case 1:
					showKilometers(meters);
					//displaySelections();
					quit = false;
				break;
				case 2:
					showInches(meters);
					//displaySelections();
					quit = false;
				break;
				case 3:
					showFeet(meters);
					//displaySelections();
					quit = false;
				break;
				case 4:
					System.out.println("\nquit the program. Bye!");
					quit = true;
				break;
				default:
					System.out.println("\n* invalid choice. Plz choose again");
					displaySelections();
					System.out.print("enter your choice: ");
					choice = kbi_1.nextInt();
					quit = false;
				break;
			}
			*/
			
			if(choice == 1) {
				showKilometers(meters);
				displaySelections();
				quit = false;
			}else if (choice == 2) {
				showInches(meters);
				displaySelections();
				quit = false;
			}else if(choice == 3) {
				showFeet(meters);
				displaySelections();
				quit = false;
			}else if (choice == 4) {
				System.out.println("\nquit the program. Bye!");
				quit = true;
			}else {
				System.out.println("\n* invalid choice. Plz choose again");
				displaySelections();
				//System.out.print("\nenter your choice: ");
				//choice = kbi_1.nextInt();
				quit = false;
			}
			
		}while(!quit);
		
		kbi_0.close();
		kbi_1.close();
	}
	
	public static void showKilometers(double m) {
		System.out.print("\n-> " + m +  " meters = ");
		double km = m * 0.001;
		System.out.println(km + " kilometers");
	}
	
	public static void showInches(double m) {
		System.out.print("\n-> " + m +  " meters = ");
		double inc = m * 39.37;
		System.out.println(inc + " inches");
	}
	
	public static void showFeet(double m) {
		System.out.print("\n-> " + m +  " meters = ");
		double ft = m * 3.281;
		System.out.println(ft + " feet");
	}
	
	public static void displaySelections() {
		System.out.println("\n\t1. Convert to kilometers\n" + 
							"\n\t2. Convert to inches\n" + 
							"\n\t3. Convert to feet\n" + 
							"\n\t4. Quit the program\n");
	}
}
