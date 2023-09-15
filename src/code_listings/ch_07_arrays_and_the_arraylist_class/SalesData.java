package code_listings.ch_07_arrays_and_the_arraylist_class;

/*
This class keeps the sales figures for a number of days in an array and provides methods for getting 

	- the total sales 
	
	- the average sales 
	
	- the highest amounts of sales 
	
	- the lowest amounts of sales
*/

public class SalesData {
	private double[] sales;

	/**
	 * the constructor copies the elements/contents from s (an array & a parameter variable) to the sales array
	 * @param s
	 */
	public SalesData(double[] s) {
		sales = new double[s.length]; // create the sales array with the same length as s
		
		// copy the contents from the s array to the sales array
		for(int index = 0; index < s.length; index++) {
			sales[index] = s[index];
		}
	}
	
	public double getTotal() {
		double total = 0.0; // accumulator
		
		for(int index = 0; index < sales.length; index++) {
			total += sales[index]; 
		}
		
		return total;
	}
	
	public double getAverage() {
		return (double) (getTotal() / sales.length);
	}
	
	public double getMaxValue() {
		double maxValue = sales[0];
		
		for(int index = 1; index < sales.length; index++) {
			if(sales[index] > maxValue) {
				maxValue = sales[index];
			}
		}
		
		return maxValue;
	}
	
	public double getMinValue() {
		double minValue = sales[0];
		
		for(int index = 1; index < sales.length; index++) {
			if(sales[index] < minValue) {
				minValue = sales[index];
			}
		}
		
		return minValue;
	}
}
