package CodeListings.Chapter7ArraysAndTheArrayListClass;

/*
- the enhanced for loop syntax:

for (dataType elementVariable : array) {
	statement;
}

+ dataType elementVariable: a variable declaration
+ array: an array's name
*/

public class EnhancedForloop {
	public static void main(String[] args) {
		int[] values = {1, 2, 3, 4, 5, 6, 7};
		
		for(int value: values) {
			System.out.println("\nthe individual value: " + value);
		}
	}
}
