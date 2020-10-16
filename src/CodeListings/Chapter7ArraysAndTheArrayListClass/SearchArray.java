package CodeListings.Chapter7ArraysAndTheArrayListClass;
import java.util.Random;
import java.util.Scanner;

/* 
- This program applies the sequential search algorithm to search arrays for specific items 

- this algorithm uses a loop to sequentially step through an array, starting with the 1st element

- It compares each element with the value being searched for and stops when the value is found or the end of the array is encountered

- If the value being searched for is not in the array, the algorithm unsuccessfully searches to the end of the array

- If the value is found, its array index is returned

- Otherwise, -1 (invalid index) is returned, indicating the value did not appear in the array
*/

public class SearchArray {
	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		Random randomNo = new Random();
		
		System.out.print("\nthe number of values: ");
		
		int numberOfValues = kbi.nextInt();
		
		System.out.println();
		
		int[] numbers = new int[numberOfValues];
		
		for(int index = 0; index < numbers.length; index++) {
			numbers[index] = randomNo.nextInt(100) + 1;
			
			System.out.print(" " + numbers[index] + " ");
		}
		
		System.out.print("\n\npick a number in the range between 1 & 100: ");
		
		int selectedNo = kbi.nextInt();
		
		int indexPosition = applySequentialSearch(numbers, selectedNo);
		
		if(indexPosition == -1) {
			System.out.println("\n\t" + selectedNo + " isn't in the numbers array");
		}else {
			System.out.println("\n\t" + selectedNo + " is in the numbers array at position #" + (indexPosition + 1));
		}
		
		kbi.close();
	}
	
	/**
	 * this method applies the sequential search algorithm to search for a specific value in an array
	 * The array that is passed as an argument into the method is searched for an occurrence of the number passed into selectedValue
	 * If the number is found, its index is returned 
	 * Otherwise, -1 is returned, indicating the value did not appear in the array
	 * 
	 * @param array the array in which the search is carried out
	 * @param selectedValue the value to be searched for in the array
	 * @return the index of the value in the array if found, otherwise return -1
	 */
	public static int applySequentialSearch(int[] array, int selectedValue) {
		int indexCounter = 0, index = -1;
		boolean found = false;
		
		// search the array for the specified number
		while(!found && indexCounter < array.length) {
			if(array[indexCounter] == selectedValue) {
				found = true;
				
				index = indexCounter;
			}
			
			indexCounter++;
		}
		
		return index;
	}
}
