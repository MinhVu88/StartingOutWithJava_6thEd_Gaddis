package CodeListings.Chapter7ArraysAndTheArrayListClass;

public class Pass2Darray {
	public static void main(String[] args) {
		int[][] numbers = {{ 1, 2, 3, 4 },
		   		   		   { 5, 6, 7, 8 },
		   		   		   { 9, 10, 11, 12 }};
		
		System.out.println("\nthe numbers array's content:\n");
		
		showContents(numbers);
		
		System.out.println("\nthe total of the array's elements: " + sumElements(numbers));
	}
	
	private static void showContents(int[][] array) {
		for(int row = 0; row < array.length; row++) {
			for(int col = 0; col < array[row].length; col++) {
				System.out.print(" " + array[row][col] + " ");
			}
			
			System.out.println();
		}
	}
	
	private static int sumElements(int[][] array) {
		int sum = 0;
		
		for(int row = 0; row < array.length; row++) {
			for(int col = 0; col < array[row].length; col++) {
				sum += array[row][col];
			}
		}
		
		return sum;
	}
}
