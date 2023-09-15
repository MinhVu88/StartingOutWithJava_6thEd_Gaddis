package code_listings.ch_04_loops_and_files;

public class MultipleStatementsInAForLoopExpression_pg213 {
	public static void main(String[] args) {
		int x,y;
		// to use multiple statements in the initialization & update expressions, separate them with commas
		// to combine multiple boolean expressions in a test expression, use && or || operators
		for(x = 1, y = 1; x <= 5; x++) {
			System.out.println(x + " + " + y + " = " + (x + y));
		}
		
		System.out.println();
		
		int a, b;
		for(a = 1, b = 1; a <= 5; a++, b++) {
			System.out.println(a + " + " + b + " = " + (a + b));
		}
	}
}
