package CodeListings.Chapter4LoopsAndFiles;
import java.util.Scanner;

/* description:   

- This program displays a triangle pattern of asterisks, which should be viewed as rows & columns
- for example, the pattern below has 8 rows & 8 columns
- the 1st row has 1 column, the 2nd row has 2 columns, the 3rd row has 3 columns & so on
- the 1st column has 8 rows, the 2nd column has 7 rows, the 3rd column has 6 rows & so on  

			*
			**
			***
			****
			*****
			******
			*******
			********
 
*/

/* ipo:

- input: asterisks, number of rows, number of columns
- process: arrange the asterisks in the conceptual structure of rows & columns that forms a triangle
- output: a triangular pattern of asterisks
*/

/* pseudocode:

- constant int var(s): ROWS = 8, COLUMNS = 8
- 
*/

public class TrianglePattern {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		/* for each of the iterations of the outermost loop, the innermost loop will iterate the number of times specified in its test condition */
		
		// version 1:
		
		// in this particular pattern, the number of rows & columns is identical (8 - 8)
		// if we count the rows downwards or upwards such as 1st row, 2nd row, 3rd row & so on, the ordinal rows & number of columns are in directly proportional
		// 1st row: 1 column, 2nd row: 2 columns, 3rd row: 3 columns & so on
		// however if we count the columns also in an ordinal manner, the ordinal columns & number of rows are in inversely proportional
		// 1st column: 8 rows, 2nd column: 7 rows, 6th column: 6 rows & so on
		// now we want the columns to be repeated 8 times but each time the number of rows per column decreases by 1
		// in other words, throughout the iteration process, the number of the columns goes up, while the number of the rows goes down
		// that's why we place the for loop of the rows inside the for loop of the columns
		// for each iteration of the columns (printing 1st, 2nd & 3rd columns), the number of rows would be subtracted by 1
		
		final int ROWS = 8, COLUMNS = 8;
		
		for(int col = 1; col <= COLUMNS; col++) {
			for(int row = 9 - col; row <= ROWS; row++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// version 2:
		
		// instead of subtracting the number of rows as we count the ordinal columns from left to right
		// let's handle this the directly proportional way: the 1st row has 1 column, the 2nd row has 2 columns, the 3rd row has 3 columns & so on
		// we also want the columns to be repeated 8 times but each time the number of rows will increase by 1
		// we place the column for loop (wheel 2) inside the row for loop (wheel 1)
		// as wheel 1 iterates, its row variable will be assigned the values 0 thru 7
		// for each iteration of wheel 1, wheel 2 will iterate row + 1 times
		// in other words, throughout the iteration process, both the number of rows & columns increases by 1 simultaneously
		// So:

		// During wheel 1’s 1st iteration, the variable row is assigned 0 

		// wheel 2 iterates 1 time, printing 1 asterisk

		// During wheel 1’s 2nd iteration, row is assigned 1 

		// wheel 2 iterates 2 times, printing 2 asterisks

		// During wheel 1’s 3rd iteration, row is assigned 2 

		// wheel 2 iterates 3 times, printing 3 asterisks

		// And so forth
		
		final int BASE_SIZE = 8;
		
		for(int row = 0; row < BASE_SIZE; row++) {
			for(int col = 0; col < (row + 1); col++) {
				System.out.print(" # ");
			}
			System.out.println();
		}
		
		kb.close();
	}
}
