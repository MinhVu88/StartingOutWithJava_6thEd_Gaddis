package CodeListings.Chapter7ArraysAndTheArrayListClass;
import java.util.Random;
import java.util.Scanner;

public class UsefulArrayAlgorithmsAndOperations {
	public static void main(String[] args) {
		/* operation 1: comparing arrays (
			- To compare the contents of 2 arrays, you must compare their elements against each other
			
			- for the elements to be the same, they must be identical in length & contents/values/data types
		*/
		
		System.out.println("\n\t\t[Comparing Arrays]");
		
		int[] array1 = {0, 2, 4, 6, 8, 10}, array2 = {0, 2, 4, 6, 8, 11};
		boolean arraysEqual = true; // flag variable
		int index_0 = 0; // loop control variable
		
		// comparing length
		if(array1.length != array2.length) {
			System.out.println("\nthe length of array1 & array2 is NOT identical");
			arraysEqual = false;
		}else {
			System.out.println("\nthe length of array1 & array2 is identical");
		}
		
		// comparing contents/values
		while(arraysEqual && index_0 < array1.length) {
			if(array1[index_0] != array2[index_0]) {
				System.out.println("\nthe values stored in array1 & array2 are NOT identical");
				arraysEqual = false;
			}
			
			index_0++;
		}
		
		if(arraysEqual) {
			System.out.println("\n=> array1 & array2 are identical");
		}else {
			System.out.println("\n=> array1 & array2 are NOT identical");
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("\n\t\t[Summing the Values in a Numeric Array]");
		
		/*
		- To sum the values in an array, you must use a loop with an accumulator variable
		
		- The loop adds the value stored in each array element to the accumulator
		*/
		
		int[] array3 = new int[5];
		int sum = 0; // accumulator variable
		Random randomNo_0 = new Random();
		
		for(int index_1 = 0; index_1 < array3.length; index_1++) {
			array3[index_1] = randomNo_0.nextInt(5) + 1;
			sum += array3[index_1];
		}
		
		System.out.println("\nthe sum of values stored in array3: " + sum);
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("\n\t\t[Getting the Average of the Values in a Numeric Array]");
		
		/*
		- The 1st step in calculating the average of all the values in an array is to sum the values
		
		- The 2nd step is to divide the sum by the number of elements in the array (or the array's length)
		*/
		
		double average = (double)(sum / array3.length);
		
		System.out.println("\nthe average of the values stored in array3: " + average);
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("\n\t\t[Finding the Highest & Lowest Values in a Numeric Array]");
		
		/*
		- to find the Highest & Lowest Values in a Numeric Array, 
		
		- 1st we copy the value in the 1st array element to the variables maxValue & minValue
		
		- Then the loop compares all of the remaining array elements, beginning at index 0, to the values in maxValue & minValue
		
		- Each time it finds a value in the array that is greater than maxValue & less than minValue, it copies that value to the 2 variables
		
		- When the loop has finished, maxValue & minValue will contain the highest & lowest values in the array
		*/
		
		Scanner kbi = new Scanner(System.in);
		Random randomNo_1 = new Random();
		
		System.out.print("\nthe number of indices in array4: ");
		int numberOfIndices = kbi.nextInt();
		
		int[] array4 = new int[numberOfIndices];
		
		// populate array4 with random numbers between 1 & 100
		for(int index_2 = 0; index_2 < array4.length; index_2++) {
			array4[index_2] = randomNo_1.nextInt(100) + 1;
		}
		
		int maxValue = array4[0];
		int minValue = array4[0];
		
		// the loop compares all the array elements to the 1st element which is assigned to maxValue & minValue
		for(int index_3 = 0; index_3 < array4.length; index_3++) {
			System.out.println("\nindex #" + index_3 + ": " + array4[index_3]);
			
			if(array4[index_3] > maxValue) {
				maxValue = array4[index_3];
			}else if (array4[index_3] < minValue) {
				minValue = array4[index_3];
			}
		}
		
		System.out.println("\n-> the max value in array4, which contains the range between 1 & 100: " + maxValue);
		System.out.println("\n-> the min value in array4, which contains the range between 1 & 100: " + minValue);
		
		
		
		kbi.close();
	}
}
