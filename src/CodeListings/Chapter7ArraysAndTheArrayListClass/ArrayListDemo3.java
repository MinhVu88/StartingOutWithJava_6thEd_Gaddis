package CodeListings.Chapter7ArraysAndTheArrayListClass;

import java.util.ArrayList;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		ArrayList<String> Tool = new ArrayList<>();
		
		Tool.add("maynard keenan");
		
		Tool.add("adam jones");
		
		Tool.add("danny carey");
		
		Tool.add("paul d'amour");
		
		System.out.println("\nTool's original line-up:");
		
		for(String bandMembers : Tool) {
			System.out.println("\n\t- " + bandMembers);
		}
		
		System.out.println("\nTool's new line-up after Paul left the band, with Justin as a new member:");
		
		Tool.remove(3);
		
		Tool.add("justin chancellor");
		
		for(String bandMembers : Tool) {
			System.out.println("\n\t- " + bandMembers);
		}
	}

}
