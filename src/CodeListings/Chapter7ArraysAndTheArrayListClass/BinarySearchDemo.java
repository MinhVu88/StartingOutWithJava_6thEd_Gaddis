package CodeListings.Chapter7ArraysAndTheArrayListClass;

import java.util.Scanner;

public class BinarySearchDemo {
	public static void main(String[] args) {
		int[] array = {13, 21, 9, 4, 25, 16, 5, 7, 24, 11, 18, 30, 14, 3, 0, 12, 28, 22, 15, 8, 10, 23, 27, 1, 6, 2, 20, 17, 29, 26, 19};
		
		System.out.print("\nthe unsorted array: ");
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
		
		System.out.print("\n\nthe sorted array in ascending order: ");
		
		for(int i = 0; i < ascending(array).length; i++) {
			System.out.print(" " + array[i]);
		}
		
		System.out.println("\n\nthe targeted value: " + binarySearch(ascending(array)));
	}
	
	private static int[] ascending(int[] array) {
		
		for(int i = 0; i < array.length - 1; i++) {
			
			for(int j = i + 1; j < array.length; j++) {
				
				if(array[i] >= array[j]) {
					
					int temp = array[i];
					
					array[i] = array[j];
					
					array[j] = temp;
				}
			}
		}
		
		return array;
	}
	
	private static int binarySearch(int[] array) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\n\nenter any number between 0 & 30: ");
		
		int searchedValue = kbi.nextInt();
		
		int firstHalf = array[0], lastHalf = array.length - 1, midPoint, searchedValueIndex = -1;
		
		boolean found = false;
		
		while(!found && firstHalf <= lastHalf) {
			// calculate the index of midPoint
			midPoint = (firstHalf + lastHalf) / 2;
			
			// is the searched value found in the middle of the array?
			if(array[midPoint] == searchedValue) {
				found = true;
				
				searchedValueIndex = array[midPoint];
			}else if(array[midPoint] > searchedValue) { // is the searched value in the 1st half
				lastHalf = midPoint - 1;
			}else { // is the searched value in the last half
				firstHalf = midPoint + 1;
			}
		}
		
		kbi.close();
		
		return searchedValueIndex;
		
	}
}
