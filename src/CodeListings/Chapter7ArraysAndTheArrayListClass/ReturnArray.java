package CodeListings.Chapter7ArraysAndTheArrayListClass;

/* 
- this program demonstrates a method named getArray that returns a reference to an array

 - beware the method's return type that must be declared properly according to the data type of the elements in the array
*/

public class ReturnArray {
	public static void main(String[] args) {
		double[] values = getArray(); // the method's return value is assigned to the compatible reference variable called values
		
		for(double value : values) {
			System.out.println("\n" + value);
		}
	}
	
	/**
	 * the getArray() method with the return type: double[]
	 * @return a reference to an array of double-type values
	 */
	public static double[] getArray() {
		double[] array = {4.7, 5.1, 6.9, 2.3, 8.8, 1.4};
		
		return array;
	}
}
