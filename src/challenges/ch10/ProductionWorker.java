package challenges.ch10;

public class ProductionWorker extends Employee {
	private int shift;
	
	private double hourlyPayRate;
	
	// a no-arg constructor
	public ProductionWorker() {}

	/**
	 * @param name
	 * @param number
	 * @param date
	 */
	public ProductionWorker(String name, String number, String date, int shift, double hourlyPayRate) {
		super(name, number, date);
		
		this.shift = shift;
		
		this.hourlyPayRate = hourlyPayRate;
	}
	
	// a copy constructor
	public ProductionWorker(ProductionWorker anotherWorker) {
		super(anotherWorker.getName(), anotherWorker.getNumber(), anotherWorker.getDate());
		
		this.shift = anotherWorker.shift;
		
		this.hourlyPayRate = anotherWorker.hourlyPayRate;
	}

	/**
	 * @return the shift
	 */
	public int getShift() {
		return shift;
	}

	/**
	 * @param shift the shift to set
	 */
	public void setShift(int shift) {
		this.shift = shift;
	}

	/**
	 * @return the hourlyPayRate
	 */
	public double getHourlyPayRate() {
		return hourlyPayRate;
	}

	/**
	 * @param hourlyPayRate the hourlyPayRate to set
	 */
	public void setHourlyPayRate(double hourlyPayRate) {
		this.hourlyPayRate = hourlyPayRate;
	}

	@Override
	public String toString() {
		String str = super.toString(); 
		
		str += " -> the shift: ";
		
		if(this.shift == 1) {
			str += "day";
		}else if(this.shift == 2) {
			str += "night";
		}else {
			str += "invalid shift number";
		}
		
		return str += ", the hourly pay rate: $" + this.hourlyPayRate;
	}
	
	
}
