package code_listings.ch_07_arrays_and_the_arraylist_class;

public class SumRowsOfA2DArray {
	public static void main(String[] args) {
		int[][] numbers = {{ 1, 2, 3, 4 },
				   		   { 5, 6, 7, 8 },
				   		   { 9, 10, 11, 12 }};
		
		/* row.column
		{ {0.0, 0.1, 0.2, 0.3},
		
		  {1.0, 1.1, 1.2, 1.3},
		  
		  {2.0, 2.1, 2.2, 2.3} }
		*/
		
		for(int row = 0; row < numbers.length; row++) {
			int rowTotal = 0; // accumulator
			
			// sum a row
			for(int col = 0; col < numbers[row].length; col++) {
				rowTotal += numbers[row][col];
			}
			
			System.out.println("\nthe total of row #" + row + ": " + rowTotal);
		}
	}
}
