package challenges.ch6;
import java.util.Scanner;

public class CarTester {
	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		int yearModel;
		String make;
		
		System.out.print("the year model: ");
		yearModel = kbi.nextInt();
		
		kbi.nextLine();
		System.out.println();
		
		System.out.print("the car's make: ");
		make = kbi.nextLine();
		
		System.out.println();
		
		Car car = new Car(yearModel, make);
		
		for(int x = 1; x <= 5; x++) {
			car.accelerate();
			car.getCurrentSpeed();
		}
		
		System.out.println("The " + car.getYearModel() + " " + car.getMake().toUpperCase() + "'s current speed after the 5th acceleration: " + car.getCurrentSpeed());
		
		for(int y = 1; y <= 5; y++) {
			car.brake();
			car.getCurrentSpeed();
		}
		
		System.out.println("\nThe " + car.getYearModel() + " " + car.getMake().toUpperCase() + "'s current speed after hitting the brake 5 times: " + car.getCurrentSpeed());
		
		kbi.close();
	}
}
