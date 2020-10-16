package CodeListings.Chapter7ArraysAndTheArrayListClass;

public class SumColumnsOfA2DArray {
	public static void main(String[] args) {
		int[][] numbers = {{ 1, 2, 3, 4 },
				   		   { 5, 6, 7, 8 },
				   		   { 9, 10, 11, 12 }};
		
		/* row.column
		{ {0.0, 0.1, 0.2, 0.3},
		
		  {1.0, 1.1, 1.2, 1.3},
		  
		  {2.0, 2.1, 2.2, 2.3} }
		*/
		
		// The outer loop controls the column index and the inner loop controls the row index 
		// The inner loop calculates the sum of a column, which is stored in an accumulator
		for(int col = 0; col < numbers[0].length; col++) {
			int colTotal = 0; // accumulator
			
			// sum a column
			for(int row = 0; row < numbers.length; row++) {
				colTotal += numbers[row][col];
			}
			
			System.out.println("\nthe total of column #" + col + ": " + colTotal);
		}
	}
}
