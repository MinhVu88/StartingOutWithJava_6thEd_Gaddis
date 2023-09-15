package challenges.ch6;

/*
- Write a Temperature class that will hold a temperature in Fahrenheit and provide methods to get the temperature in Fahrenheit, Celsius and Kelvin 

- The class should have the following field:

� ftemp � A double that holds a Fahrenheit temperature

- The class should have the following methods:

� Constructor � The constructor accepts a Fahrenheit temperature (as a double) and stores it in the ftemp field

� setFahrenheit � The setFahrenheit method accepts a Fahrenheit temperature (as a double) and stores it in the ftemp field

� getFahrenheit � Returns the value of the ftemp field, as a Fahrenheit temperature (no conversion required)

� getCelsius � Returns the value of the ftemp field converted to Celsius

� getKelvin � Returns the value of the ftemp field converted to Kelvin

- Use the following formula to convert the Fahrenheit temperature to Celsius:	Celsius = (5/9) * (Fahrenheit - 32)

- Use the following formula to convert the Fahrenheit temperature to Kelvin:	Kelvin = ((5/9) * (Fahrenheit - 32)) + 273

- Demonstrate the Temperature class by writing a separate program that asks the user for a Fahrenheit temperature 

- The program should create an instance of the Temperature class, with the value entered by the user passed to the constructor 

- The program should then call the object�s methods to display the temperature in Celsius and Kelvin
*/

public class Temperature {
	private double FahTemp;

	/**
	 * @param fahTemp
	 */
	public Temperature(double fahTemp) {
		FahTemp = fahTemp;
	}

	public double getCelsius() {
		return (5 * (FahTemp - 32)) / 9;
	}
	
	public double getKelvin() {
		return (5 * (FahTemp - 32)) / 9 + 273;
	}
	
}
