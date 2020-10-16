package CodeListings.Chapter7ArraysAndTheArrayListClass;

public class PassElements {
	public static void main(String[] args) {
		int[] numbers = {47, 51, 23, 13, 7, 69, 88};
		
		System.out.print("\nsingle-value handling method: ");
		
		for(int index = 0; index < numbers.length; index++) {
			processIndividualValues(numbers[index]);
		}
		
		System.out.println();
		
		System.out.print("\nwhole-array handling method: ");
		
		processEntireArray(numbers);
	}
	
	/** 
	 * this method takes the numbers array's individual values as its arguments
	 * @param individualNumbers receives individual values of numbers
	 */
	public static void processIndividualValues(int individualNumbers) {
		System.out.print(individualNumbers + " | ");
	}
	
	/**
	 * this method takes the numbers array as its argument
	 * @param array is declared as an array reference variable & receives the entire array, not a single value
	 */
	public static void processEntireArray(int[] array) {
		for(int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " | ");
		}
	}
}
