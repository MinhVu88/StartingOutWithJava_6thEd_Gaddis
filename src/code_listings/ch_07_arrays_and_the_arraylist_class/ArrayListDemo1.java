package code_listings.ch_07_arrays_and_the_arraylist_class;
import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// create an ArrayList to hold some String objects
		ArrayList<String> names = new ArrayList<>();
		
		// add names to the ArrayList
		names.add("maynard keenan");
		
		names.add("adam jones");
		
		names.add("danny carey");
		
		names.add("paul d'amour");
		
		names.add("justin chancellor");
		
		System.out.println("\nthe names ArrayList's size: " + names.size());
		
		System.out.println("\nthe values stored in the ArrayList's indices:");

		// use the traditional for loop with the ArrayList
		for(int index = 0; index < names.size(); index++) {
			System.out.println("\n\t- " + names.get(index));
		}
	}

}
