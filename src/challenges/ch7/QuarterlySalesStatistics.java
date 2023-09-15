package challenges.ch7;

import java.util.Random;

public class QuarterlySalesStatistics {
	private double[][] quarterlySalesFigures;
	
	private static final int DIVISIONS = 6, QUARTERS = 4;

	/**
	 * @return the quarterlySalesFigures
	 */
	public double[][] getQuarterlySalesFigures() {
		return this.quarterlySalesFigures;
	}

	/**
	 * @param quarterlySalesFigures the quarterlySalesFigures to set
	 */
	public void setQuarterlySalesFigures(double[][] quarterlySalesFigures) {
		this.quarterlySalesFigures = quarterlySalesFigures;
	}

	public QuarterlySalesStatistics() {}

	/**
	 * @param quarterlySalesFigures
	 */
	public QuarterlySalesStatistics(double[][] quarterlySalesFigures) {
		this.quarterlySalesFigures = quarterlySalesFigures;
	}
	
	public QuarterlySalesStatistics(Random randomNo) {
		this.quarterlySalesFigures = new double[DIVISIONS][QUARTERS];
		
		for(int rows = 0; rows < this.quarterlySalesFigures.length; rows++) {
			for(int cols = 0; cols < this.quarterlySalesFigures[rows].length; cols++) {
				this.quarterlySalesFigures[rows][cols] = randomNo.nextInt(100) + 1;
			}
		}
		
		for(int rows = 0; rows < this.quarterlySalesFigures.length; rows++) {
			System.out.println("\nDivision #" + (rows + 1) + ":");
			
			for(int cols = 0; cols < this.quarterlySalesFigures[rows].length; cols++) {
				System.out.println("\n\tQuarter #" + (cols + 1) + ": $" + this.quarterlySalesFigures[rows][cols]);
			}
			
			System.out.println("------------------------------");
		}
	}
	
	/*
	public double[][] compareFigures() {
		
	}
	*/
	
	public double totalFiguresPerQuarter(Random randomNo, double[][] array) {
		this.quarterlySalesFigures = new double[DIVISIONS][QUARTERS];
		
		for(int rows = 0; rows < this.quarterlySalesFigures.length; rows++) {
			for(int cols = 0; cols < this.quarterlySalesFigures[rows].length; cols++) {
				this.quarterlySalesFigures[rows][cols] = randomNo.nextInt(100) + 1;
			}
		}
		
		for(int rows = 0; rows < this.quarterlySalesFigures.length; rows++) {
			for(int cols = 0; cols < this.quarterlySalesFigures[rows].length; cols++) {
				array[rows][cols] = this.quarterlySalesFigures[rows][cols];
			}
		}
		
		double total = 0.0;
		
		for(int rows = 0; rows < array.length; rows++) {
			
			for(int cols = 0; cols < array[rows].length; cols++) {
				total += array[rows][cols];
			}
		}
		
		return total;
	}
}