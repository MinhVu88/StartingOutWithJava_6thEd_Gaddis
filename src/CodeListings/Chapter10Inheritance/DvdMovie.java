package CodeListings.Chapter10Inheritance;

public class DvdMovie implements RetailItem {
	private String title;
	
	private int runningTime;
	
	private double retailPrice;	
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the runningTime
	 */
	public int getRunningTime() {
		return runningTime;
	}

	/**
	 * @param runningTime the runningTime to set
	 */
	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}

	/**
	 * @param retailPrice the retailPrice to set
	 */
	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}

	@Override
	public double getRetailPrice() {
		return this.retailPrice;
	}

	public DvdMovie() {}

	/**
	 * @param title
	 * @param runningTime
	 * @param retailPrice
	 */
	public DvdMovie(String title, int runningTime, double retailPrice) {
		this.title = title;
		
		this.runningTime = runningTime;
		
		this.retailPrice = retailPrice;
	}
	
	
}
