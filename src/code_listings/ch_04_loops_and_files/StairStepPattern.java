package code_listings.ch_04_loops_and_files;
import java.util.Scanner;

/* description:  

- suppose you want to display the following stair-step pattern that has 6 rows & 6 columns:

# 	1st row
- # 	2nd row
- - # 		3rd row
- - - # 		4th row
- - - - # 			5th row
- - - - - # 			6th row
1 2 3 4 5 6 (column)

$ 	1st row
- $ 	2nd row
- - $ 		3rd row
- - - $ 		4th row
- - - - $ 			5th row
- - - - - $ 			6th row
1 2 3 4 5 6 (column)
          
- In general, we can describe each column as having some number of hyphens under a # character 

- Here�s a column-by-column description:
	+ 1st column: 5 hyphens under 1 # 
	+ 2nd column: 4 hyphens under 1 # 
	+ 3rd column: 3 hyphens under 1 # 
	+ 4th column: 2 hyphens under 1 # 
	+ 5th column: 1 hyphen under 1 # 
	+ 6th column: 0 hyphen under 1 #

- In general, we can describe each row as having some number of spaces followed by a $ character

- Here's a row-by-row description:
 	+ 1st row: 0 hyphen followed by 1 $
 	+ 2nd row: 1 hyphen followed by 1 $
 	+ 3rd row: 2 hyphens followed by 1 $
 	+ 4th row: 3 hyphens followed by 1 $
 	+ 5th row: 4 hyphens followed by 1 $
 	+ 6th row: 5 hyphens followed by 1 $
*/

/* ipo:

- input: number of #/$, number of hyphens, number of columns/rows
- process: write code that contains a pair of nested loops that perform:
	+ the outer loop (wheel 1) will iterate 6 times, each time:
		* the inner loop (wheel 2) prints the correct number of hyphens, side by side
		* then prints a #/$ character
- output: the stair-step pattern of the sharp/money characters
*/

/* pseudocode:

- constant int var(s): rows, spaces
- 
*/

public class StairStepPattern {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		final int SYMBOL_1 = 6, SYMBOL_2 = 6, HYPHENS = 5; // the number of #, $ and - in the patterns
		
		// version 1 (columns):
		
		// in both versions, the column & row variables must start at 1 because there must be at least 1 row & 1 column for the symbols & hyphens to exist
		// 
		
		for(int column = 1; column <= SYMBOL_1; column++) {
			for(int hyphen = 7 - column; hyphen <= HYPHENS; hyphen++) {
				System.out.print("-");
			}
			System.out.println("#");
		}
		
		System.out.println();
		
		// version 2 (rows):
		for(int row = 1; row <= SYMBOL_2; row++) {
			for(int hyphen = 0; hyphen < row - 1; hyphen++) {
				System.out.print("-");
			}
			System.out.println("$");
		}
		
		kb.close();
	}
}
