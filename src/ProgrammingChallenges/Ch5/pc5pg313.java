package ProgrammingChallenges.Ch5;

/*
- When an object is falling because of gravity, the following formula can be used to determine the distance the object falls in a specific time period: d = (1/2) * g * t^2

- The variables in the formula: 

		+ d is the distance in meters 
		+ g is 9.8 
		+ t is the amount of time, in seconds, that the object has been falling

- Write a method named fallingDistance that accepts an object’s falling time (in seconds) as an argument 

- The method should return the distance, in meters, that the object has fallen during that time interval 

- Demonstrate the method by calling it in a loop that passes the values 1 through 10 as arguments and displays the return value
*/

public class pc5pg313 {
	public static void main(String[] args) {
		System.out.println("the distance, in meters, that the object has fallen during that time interval: ");
		
		for(int fallingTime = 1; fallingTime <= 10; fallingTime++) {
			System.out.println("\n\t" + fallingDistance(fallingTime) + " meters");
		}
	}
	
	public static double fallingDistance(int falling_time) {
		double distance = 0.5 * 9.8 * Math.pow(falling_time, 2);
		return distance;
	}
}
