package ProgrammingChallenges.Ch10;

public class CruiseShip extends Ship {
	private int maxPassengers;
	
	// a no-arg constructor
	public CruiseShip() {}

	/**
	 * @param name
	 * @param year
	 */
	public CruiseShip(String name, String year, int maxPassengers) {
		super(name, year);
		
		this.maxPassengers = maxPassengers;
	}

	/**
	 * @return the maxPassengers
	 */
	public int getMaxPassengers() {
		return maxPassengers;
	}

	/**
	 * @param maxPassengers the maxPassengers to set
	 */
	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}

	@Override
	public String toString() {
		return "\nThe cruise ship's max number of passengers: " + maxPassengers + " & its name: " + getName();
	}
	
	
}
