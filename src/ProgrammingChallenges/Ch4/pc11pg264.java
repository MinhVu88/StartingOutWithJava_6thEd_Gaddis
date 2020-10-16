package ProgrammingChallenges.Ch4;

/* 
- Write a program that displays a table of the Celsius temperatures 0 through 20 & their Fahrenheit equivalents 
- The formula for converting a temperature from Celsius to Fahrenheit is F = 9/5 * C + 32
- where F is the Fahrenheit temperature & C is the Celsius temperature 
- Your program must use a loop to display the table
*/

public class pc11pg264 {
	public static void main(String[] args) {
		int cel, fah;
		
		System.out.println("Celcius                     Fahrenheit");
		System.out.println("--------------------------------------");
		
		for(cel = 0; cel <= 20; cel++) {
			fah = ((9 * cel) / 5) + 32;
			System.out.println(cel + "                           " + fah);
		}
	}
}
