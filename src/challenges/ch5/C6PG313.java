package challenges.ch5;


/*
- The formula for converting a temperature from Fahrenheit to Celsius: C = (5/9) * (F - 32)

- F: Fahrenheit temperature & C: Celsius temperature 

- Write a method named celsius that accepts a Fahrenheit temperature as an argument 

- The method should return the temperature, converted to Celsius 

- Demonstrate the method by calling it in a loop that displays a table of the Fahrenheit temperatures 0 through 20 & their Celsius equivalents
*/

public class C6PG313 {
	public static void main(String[] args) {
		System.out.println("Fahrenheit		       Celcius");
		System.out.println("---------------------------------------");
		
		for(double f = 0.0; f <= 20.0; f++) {
			System.out.println(f + "                            " + celcius(f));
		}
	}
	
	public static double celcius(double fah) {
		double cel = Math.round((5 * (fah - 32)) / 9);
		return cel;
	}
}
