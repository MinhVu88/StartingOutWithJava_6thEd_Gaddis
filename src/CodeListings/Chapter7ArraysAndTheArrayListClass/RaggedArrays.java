package CodeListings.Chapter7ArraysAndTheArrayListClass;

/*
- Because the rows in a 2-dimensional array are also 1-dimensional arrays, each row can have its own length 

- When the rows of a 2-dimensional array are of different lengths, the array is known as a ragged array 

- You create a ragged array by 1st creating a 2-dimensional array with a specific number of rows, but no columns
*/

public class RaggedArrays {
	public static void main(String[] args) {
		int[][] raggedArray = new int[4][];
		
		raggedArray[0] = new int[3];
		
		raggedArray[1] = new int[4];
		
		raggedArray[2] = new int[5];
		
		raggedArray[3] = new int[6];
		
		for(int oneDArray = 0; oneDArray < raggedArray.length; oneDArray++) {
			System.out.println("\n1D array #" + oneDArray + "'s length: " + raggedArray[oneDArray].length);
		}
	}
}
