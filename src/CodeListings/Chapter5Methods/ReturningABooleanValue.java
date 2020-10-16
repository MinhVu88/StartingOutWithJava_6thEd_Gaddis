package CodeListings.Chapter5Methods;
import java.util.Random;

public class ReturningABooleanValue {
	public static void main(String[] args) {
		Random randomNo = new Random();
		
		int val = randomNo.nextInt(90) + 1;
		
		System.out.println("\nis this randomly computer-generated number between 30 & 60?");
		
		if(isValid(val)) {
			System.out.println("\n-> the value is between 30 & 60: " + val);
		}else {
			System.out.println("\n-> the value is out of range: " + val);
		}
	}
	
	public static Boolean isValid(int value) {
		boolean status;
		
		if(value >= 30 && value <= 60) {
			status = true;
		}else {
			status = false;
		}
		
		return status;
	}
}
