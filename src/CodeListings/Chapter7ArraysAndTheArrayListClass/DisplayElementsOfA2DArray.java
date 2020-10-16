package CodeListings.Chapter7ArraysAndTheArrayListClass;

public class DisplayElementsOfA2DArray {
	public static void main(String[] args) {
		int[][] numbers = {{ 1, 2, 3, 4 },
						   { 5, 6, 7, 8 },
						   { 9, 10, 11, 12 }};
		
		// approach #1 (this's ineffective as a certain number of rows & columns must be declared for the loop to run)
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 4; col++) {
				System.out.print(numbers[row][col] + " ");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		// approach #2 (this's better as it works with any number of rows & columns)
		// numbers.length holds the number of rows in the array, it's used as the upper limit for the row indices
		// each row’s length field holds the number of columns in the row, it's used as the upper limit for the column indices
		for(int row = 0; row < numbers.length; row++) {
			for(int col = 0; col < numbers[row].length; col++) {
				System.out.print(numbers[row][col] + " ");
			}
			
			System.out.println();
		}
	}
}
