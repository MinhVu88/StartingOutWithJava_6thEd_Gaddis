package code_listings.ch_11_exceptions_and_advanced_fileio;

// this program causes an error & crashes

public class BadArray {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3};
		
		for(int index = 0; index <= numbers.length; index++) {
			System.out.println(" " + numbers[index]);
		}
	}

}
