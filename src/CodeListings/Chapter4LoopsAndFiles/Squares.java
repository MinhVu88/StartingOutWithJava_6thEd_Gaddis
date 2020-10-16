package CodeListings.Chapter4LoopsAndFiles;

public class Squares {
	public static void main(String[] args) {
		int number0;
		System.out.println("Number 		Number squared");
		System.out.println("------------------------------");
		
		for(number0 = 1; number0 <= 10; number0++) {
			System.out.println(number0 + "\t\t" + number0 * number0);
		}
		
		System.out.println("\nEven numbers:");
		System.out.println("------------------------------");
		
		for(int number1 = 0; number1 <= 10; number1 += 2) {
			System.out.println(number1);
		}
	}
}
