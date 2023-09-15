package challenges.ch5;
import java.util.Scanner;

/*
- A prime number is a positive integer that is evenly divisible only by itself & 1 

- For example, the number 5 is prime because it can be evenly divided only by 1 & 5 

- The number 6, however, is not prime because it can be divided evenly by 1, 2, 3 & 6

- Write a method named isPrime, which takes an integer as an argument & returns true if the argument is a prime number or false otherwise 

- Demonstrate the method in a complete program

# Tip: Recall that the % operator divides 1 number by another & returns the remainder of the division 

# In an expression such as num1 % num2, the % operator will return 0 if num1 is evenly divisible by num2
*/

public class C13PG316 {
	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nenter any number: ");
		int number = kbi.nextInt();
		
		if(isPrime(number)) {
			System.out.println("\n" + number + " is a prime number");
		}else {
			System.out.println("\n" + number + " is not a prime number");
		}
		
		kbi.close();
	}
	
	/** 
	 * Because a prime number is only divisible by 1 & itself so you start from 2 to check if it is divisible by any other number except 1 & itself
	 * @param no
	 * @return
	 */
	public static boolean isPrime(int no) {
		boolean prime = true;
		
		if(no % 2 == 0 && no != 2) {
			prime = false;
		}
		
		for(int divisor = 3; divisor * divisor <= no; divisor += 2) {
	        if(no % divisor == 0) {
	            return false;
	        }
	    }
		
		return prime;
	}
}
