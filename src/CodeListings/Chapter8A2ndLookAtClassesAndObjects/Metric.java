package CodeListings.Chapter8A2ndLookAtClassesAndObjects;

// the program has 2 static methods: milesToKm & kmToMiles

public class Metric {
	/**
	 * this method converts a distance from miles to kilometers
	 * @param miles the distance in miles
	 * @return the distance in km
	 */
	public static double milesToKm(double miles) {
		return miles * 1.609;
	}
	
	/**
	 * this method converts a distance from kilometers to miles
	 * @param km the distance in km
	 * @return the distance in miles
	 */
	public static double kmToMiles(double km) {
		return km / 1.609;
	}
}
