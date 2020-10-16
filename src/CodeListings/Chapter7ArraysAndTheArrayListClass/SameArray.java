package CodeListings.Chapter7ArraysAndTheArrayListClass;

/* 
- it's wrong to copy 1 array's contents to another by just assigning an array reference variable to another

- that's because the array & the array reference variables are 2 separate, distinct entities
*/
public class SameArray {
	public static void main(String[] args) {
		int[] array1 = {0, 2, 4, 6, 8, 10};
		int[] array2 = array1; // these 2 array reference variables, arra1 & arra2, reference the same array instance
		
		array1[2] = 5;
		array2[5] = 13;
		
		System.out.print("\nthe contents of array1: ");
		for(int value: array1) {
			System.out.print(value + " | ");
		}
		
		System.out.print("\nthe contents of array2: ");
		for(int value: array2) {
			System.out.print(value + " | ");
		}
		
		System.out.println();
		
		// to truly copy 1 array's individual elements to another, use a for loop like this:
		
		int[] array3 = {1, 3, 5, 7, 9, 11};
		int[] array4 = new int[6];
		
		for(int index = 0; index < array3.length; index++) {
			array4[index] = array3[index];
		}
		
		array3[2] = 4;
		array4[5] = 10;
		
		System.out.print("\nthe contents of array3: ");
		for(int value: array3) {
			System.out.print(value + " | ");
		}
		
		System.out.print("\nthe contents of array4: ");
		for(int value: array4) {
			System.out.print(value + " | ");
		}
	}
}
