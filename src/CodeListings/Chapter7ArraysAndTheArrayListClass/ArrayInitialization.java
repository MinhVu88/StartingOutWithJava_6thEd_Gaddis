package CodeListings.Chapter7ArraysAndTheArrayListClass;

public class ArrayInitialization {
	public static void main(String[] args) {
		String[] weekDays = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"}; // hardcoded values in the array are called initialization list
		
		for(int index = 0; index < weekDays.length; index++) {
			System.out.println("\nweekday " + (index + 1) + ": " + weekDays[index].toUpperCase());
		}
	}
}
