package CodeListings.Chapter7ArraysAndTheArrayListClass;
import java.util.Random;

public class InvalidSubscript {
	public static void main(String[] args) {
		int[] values = new int[3];
		
		Random randomNo = new Random();
		
		System.out.println("\nthe values array's fixed length: " + values.length + " => there are 3 elements in the array");
		
		System.out.println("\nso it's impossible & false to insert more elements into values");
		
		for(int index = 0; index <= values.length; index++) {
			System.out.print("\nindex " + index + ": ");
			
			values[index] = randomNo.nextInt();
			
			System.out.println(values[index]);
		}
	}
}
