package code_listings.ch_04_loops_and_files;

/* A program that displays a table of speeds in kilometers per hour (KPH) with their values converted to miles per hour (MPH)
 * The formula for converting KPH to MPH is MPH = KPH * 0.6214
 * The table should show speeds from 60 KPH through 130 KPH, in increments of 10, along with their values converted to MPH
 * You will write a for loop that uses a counter variable to hold the KPH speeds
 * The counter�s starting value will be 60, its ending value will be 130 & you will add 10 to the counter variable after each iteration
 * Inside the loop you will use the counter variable to calculate a speed in MPH
 * */

public class SpeedConverter {
	public static void main(String[] args) {
		int kph, mph;
		
		System.out.println("KPH ----------------> MPH");
		
		for(kph = 60; kph <= 130; kph += 10) {
			mph = (int)(kph * 0.6214);
			System.out.println("\n" + kph + "                    " + mph);
		}
	}
}
