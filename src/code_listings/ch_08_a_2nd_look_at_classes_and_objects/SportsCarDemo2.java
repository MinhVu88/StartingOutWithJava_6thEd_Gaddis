package code_listings.ch_08_a_2nd_look_at_classes_and_objects;

public class SportsCarDemo2 {

	public static void main(String[] args) {
		SportsCar car = new SportsCar(CarType.TESLA, CarColors.RED, 51.723);
		
		// in the case statements that the enumerated constants are not fully qualified
		// If you give a fully qualified enum constant name as a case expression, a compiler error will result
		switch (car.getBrands()) {
			case VOLKSWAGEN:
				System.out.println("\nmade in germany");
				break;
			case BMW:
				System.out.println("\nmade in europe");
				break;
			case TESLA:
				System.out.println("\nmade in the U.S");
				break;
			case FORD:
				System.out.println("\nmade in the States");
				break;
			case TOYOTA:
				System.out.println("\nmade in japan");
				break;
			default:
				System.out.println("\nlocation unknown");
				break;
		}
	}

}
