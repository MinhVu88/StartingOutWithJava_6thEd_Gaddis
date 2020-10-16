package CodeListings.Chapter8A2ndLookAtClassesAndObjects;

// This program demonstrates the SportsCar class

public class SportsCarDemo {

	public static void main(String[] args) {
		// create a SportsCar instance
		SportsCar aNewCar = new SportsCar(CarType.VOLKSWAGEN, CarColors.SILVER, 47.369);
		
		System.out.println(aNewCar);
	}

}
