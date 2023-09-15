package code_listings.ch_10_inheritance;

// this program demonstrates how an interface reference variable can be used as a method parameter

public class PolymorphicInterfaceDemo {

	public static void main(String[] args) {
		CompactDisc cd = new CompactDisc("Lateralus", "Tool", 46.2);
		
		DvdMovie movie = new DvdMovie("Fight Club", 69, 13.69);
		
		System.out.println("\nitem #1: " + cd.getTitle());
		
		showPrice(cd);
		
		System.out.println("\nitem #2: " + movie.getTitle());
		
		showPrice(movie);
	}
	
	/**
	 * 
	 * @param item an interface reference variable of RetailItem type
	 */
	private static void showPrice(RetailItem item) {
		System.out.println("\n* price: $" + item.getRetailPrice());
	}
}
