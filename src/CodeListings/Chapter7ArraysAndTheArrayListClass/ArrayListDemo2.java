package CodeListings.Chapter7ArraysAndTheArrayListClass;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		
		names.add("maynard keenan");
		
		names.add("adam jones");
		
		names.add("danny carey");
		
		names.add("paul d'amour");
		
		names.add("justin chancellor");
		
		System.out.println("\nthe names ArrayList's size: " + names.size());
		
		System.out.println("\nthe values stored in the ArrayList's indices:");
		
		// use the enhanced for loop with the ArrayList
		for(String name : names) {
			System.out.println("\n\t- " + name);
		}
	}

}
