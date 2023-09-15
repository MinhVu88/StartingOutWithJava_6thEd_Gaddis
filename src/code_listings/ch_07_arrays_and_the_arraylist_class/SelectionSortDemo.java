package code_listings.ch_07_arrays_and_the_arraylist_class;

/*
- A sorting algorithm is a technique for scanning through an array and rearranging its contents in some specific order 

- The algorithm that we will explore is called the selection sort

- The selection sort works like this: The smallest value in the array is located and moved to element 0 

- Then the next smallest value is located and moved to element 1 

- This process continues until all of the elements have been placed in their proper order
*/

/* for example:

elements: 	5		7		2		8		9		1
indices:	0		1		2		3		4		5

- The selection sort scans the array, starting at element 0 and locates the element with the smallest value 

- The contents of this element are then swapped with the contents of element 0 

- In this example, the 1 stored in element 5 is swapped with the 5 stored in element 0

- The algorithm then repeats the process but because element 0 already contains the smallest value in the array, it can be left out of the procedure 

- This time, the algorithm begins the scan at element 1 

- In this example, the contents of element 2 are exchanged with that of element 1

- Once again the process is repeated but this time the scan begins at element 2 

- The algorithm will find that element 5 contains the next smallest value 

- This element�s value is swapped with that of element 2

- Next, the scanning begins at element 3 

- Its value is swapped with that of element 5

- At this point there are only 2 elements left to sort 

- The algorithm finds that the value in element 5 is smaller than that of element 4, so the two are swapped
*/

public class SelectionSortDemo {
	public static void main(String[] args) {
		int[] array = {5, 7, 2,	8, 9, 1};
		
		System.out.print("\nthe unsorted array: ");
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
		
		System.out.print("\n\nthe sorted array in ascending order: ");
		
		for(int i = 0; i < ascending(array).length; i++) {
			System.out.print(" " + array[i]);
		}
		
		System.out.print("\n\nthe sorted array in descending order: ");
		
		for(int i = 0; i < descending(array).length; i++) {
			System.out.print(" " + array[i]);
		}
	}
	
	/* an explanation of the nested for loops: the outer loop (i) & the inner loop (j)
	
	the original order: 							5		7		2		8		9		1
	
	the starting positions of the 2 loops:			i		j------------------------------->
	
	1/ the iterations:
	
		a) the 1st iteration of i:
	
			- i starts at the 1st element, whose value is 5 in this case
		
			- j starts at 7 & loops thru the rest of the array's elements
			
			- j compares each of the remaining elements to the 1st one in order to find the smallest value in the array
			
			- when j finds the smallest value, j swaps it with the value which the 1st element holds (5)
			
			- if the 1st element's value is already the smallest, the swap doesn't occur
			
			- when the smallest value is moved to index 0, i's 2nd iteration begins
			
			-> the current order after the 1st iteration:	[1]	 7	 2	 8	 9	[5]
																 i   j----------->
		
		b) the 2nd iteration of i:
		
			- i starts at 7
			
			- j starts at 2 & loops thru the rest of the array's elements
			
			- j compares each of the remaining elements to the 2nd one in order to find the next smallest value in the array
			
			- when j finds the next smallest value, j swaps it with the value which the 2nd element holds (7)
			
			- when the 2nd smallest value is moved to index 1, i's 3rd iteration begins
			
			-> the current order after the 2nd iteration:	1	[2]	  [7]	8	 9	  5
																	   i    j--------->
		
		c) the 3rd iteration of i:
		
			- i starts at 7
			
			- j starts at 8 & loops thru the rest of the array's elements
			
			- j compares each of the remaining elements to the 3rd one in order to find the next smallest value in the array
			
			- when j finds the next smallest value, j swaps it with the value which the 3rd element holds (7)
			
			- when the 3rd smallest value is moved to index 2, i's 4th iteration begins
			
			-> the current order after the 3rd iteration:	1	2	[5]	 8	 9	 [7]
																		 i   j---->
		
		d) the 4th iteration of i:
		
			- i starts at 8
			
			- j starts at 9 & loops thru the rest of the array's elements
			
			- j compares each of the remaining elements to the 4th one in order to find the next smallest value in the array
			
			- when j finds the next smallest value, j swaps it with the value which the 4th element holds (8)
			
			- when the 4th smallest value is moved to index 3, i's 5th iteration begins
			
			-> the current order after the 4th iteration:	1	2	5	[7]	   [8]	  9
																			    i     j
		
		e) the 5th iteration of i:
		
			- i starts at 8
			
			- j starts at 9, which is the last element in the array
			
			- j compares the last element's value to the 5th one's & makes the final swap if necessary
			
			- in this case the last element's value is already greater than the 5th one's, so the swap doesn't happen
			
			-> the current order after the 5th iteration:	1	2	5	7	8	9
		
		=> Notes:
		
			- i's index must stop at the element right before the last one & j's index must reach the final element
			
			- that's why i's condition is: i < array.length - 1 & j's condition is: j < array.length
			
			- that's how the 2 final elements in the array can be compared against each other
			
			- i's index always holds the smallest values in ascending order & the largest values in descending order
	
	2/ the if statement & the swaps:
	
		- In ascending order, array[i] >= array[j] means that in each of i's & j's iterations, 
			
			if the value held by i's current element is greater than or equal to the value held by j's current element,
			
			the value of the i's current element will be assigned to the temp variable (temp = array[i]'s value)
			
		- After that the value held by j's current element is assigned to i's element (array[i] = array[j]'s value)
		
		- Then temp's value is assigned to j's element (array[j] = temp's value)
		
		- Finally the value of i's current element holds the value of j's current element &
		
			the value of j's current element holds the value of i's current element
		
		- In descending order, the if condition is array[i] <= array[j]
		
	3/ the temp variable:
	
		int a = 10, b = 5;
		
		int temp = a;   // a's value is assigned to temp => temp = 10 & a = 10
		
		a = b;   // b's value is assigned to a => a = 5 & b = 5
		
		b = temp;   // temp's value is assigned to b => b = 10 & temp = 10
		
		System.out.println("a: " + a); 		// a = 5
		
		System.out.println("b: " + b);		// b = 10
		
		System.out.println("temp: " + temp);		// temp = 10
	*/
	
	private static int[] ascending(int[] array) {
		
		for(int i = 0; i < array.length - 1; i++) {
			
			for(int j = i + 1; j < array.length; j++) {
				
				if(array[i] >= array[j]) {
					
					int temp = array[i];
					
					array[i] = array[j];
					
					array[j] = temp;
				}
			}
		}
		
		return array;
	}
	
	private static int[] descending(int[] array) {
		
		for(int i = 0; i < array.length - 1; i++) {
			
			for(int j = i + 1; j < array.length; j++) {
				
				if(array[i] <= array[j]) {
					
					int temp = array[i];
					
					array[i] = array[j];
					
					array[j] = temp;
				}
			}
		}
		
		return array;
	}
}
