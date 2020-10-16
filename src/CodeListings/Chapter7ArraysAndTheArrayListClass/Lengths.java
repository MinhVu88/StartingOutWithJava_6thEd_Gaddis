package CodeListings.Chapter7ArraysAndTheArrayListClass;

public class Lengths {
	public static void main(String[] args) {
		// think of a 2-dimensional array as an array of 1-dimensional arrays
		// When initializing a 2-dimensional array, enclose each row’s initialization list in its own set of braces
		// create a 2-d array with 3 rows & 4 columns
		int[][] array = {{1, 2, 3, 4}, 
						 {5, 6, 7, 8}, 
						 {9, 10, 11, 12}};
		
		/* row.column
		{ {0.0, 0.1, 0.2, 0.3},
		
		  {1.0, 1.1, 1.2, 1.3},
		  
		  {2.0, 2.1, 2.2, 2.3} }
		*/
		
		System.out.println("\nthe number of rows/elements/1-D arrays in the 2-D array: " + array.length);
		
		System.out.println("\nthe number of columns/elements in each row of the 2-D array/each 1-D array:");
		
		for(int index = 0; index < array.length; index++) {
			System.out.println("\n\trow/1-D array #" + index + " has " + array[index].length + " columns/elements");
		}
	}
}
