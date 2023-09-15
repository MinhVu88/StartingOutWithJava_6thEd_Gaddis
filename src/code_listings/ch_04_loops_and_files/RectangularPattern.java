package code_listings.ch_04_loops_and_files;
import java.util.Scanner;

/* description: This program displays a rectangular pattern of asterisks, which should be viewed as rows & columns (e.g. 3 rows & 6 columns)
 	
 	* * * * * *	1 
 	* * * * * *	2
 	* * * * * *	3
 	1 2 3 4 5 6 
 	
*/

/*ipo:

- input: asterisks, number of rows, number of columns
- process: arrange the asterisks in the conceptual structure of rows & columns that forms a rectangle
- output: a rectangular pattern of asterisks
*/

/* pseudocode:

- declare int var(s): columns, rows
- display "enter the number of rows: "
- input rows
- display "enter the number of columns: "
- input columns
- outermost loop (wheel 1): for row = 0 to rows
	- innermost loop (wheel 2): for col = 0 to columns
		+ print * horizontally
	- print a space b/w each row of *
*/

public class RectangularPattern {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int rows, columns;
		
		System.out.print("enter the number of rows: ");
		rows = kb.nextInt();
		
		System.out.print("enter the number of column: ");
		columns = kb.nextInt();
		
		System.out.println();
		
		/* for each of the iterations of the outermost loop, the innermost loop will iterate the number of times specified in its test condition */
		
		// in this analogy, the outermost loop = the row for loop = wheel 1 & the innermost loop = the column for loop = wheel 2
		// if we want to make a rectangle composed of 3 rows & 6 columns as depicted above, then we should think about structuring it this way
		// the 6 columns should be repeated horizontally 3 times
		// that's why the column for loop (wheel 2) should be placed inside the row for loop (wheel 1)
		// after printing 6 columns on a line for the 1st iteration of wheel 1 , the program temporarily steps out of wheel 2 & print a new line
		// the program then gets back to wheel 1, adds 1 to the row variable, checks the validity of wheel 1's test condition
		// if the test condition is true, then once again the program dives into wheel 2
		// this iteration process continues until wheel 1's test condition is false
		
		for(int row = 0; row < rows; row++) {
			for(int col = 0; col < columns; col++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		kb.close();
	}
}
