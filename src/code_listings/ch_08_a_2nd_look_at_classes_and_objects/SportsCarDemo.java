package code_listings.ch_08_a_2nd_look_at_classes_and_objects;

// This program demonstrates the SportsCar class

public class SportsCarDemo {

	public static void main(String[] args) {
		// create a SportsCar instance
		SportsCar aNewCar = new SportsCar(CarType.VOLKSWAGEN, CarColors.SILVER, 47.369);
		
		System.out.println(aNewCar);
	}

}
