package ProgrammingChallenges.Ch10;

public class CargoShip extends Ship {
	private int capacity;
	
	// a no-arg constructor
	public CargoShip() {}

	/**
	 * @param name
	 * @param year
	 */
	public CargoShip(String name, String year, int capacity) {
		super(name, year);
		
		this.capacity = capacity;
	}

	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "\nThe cargo ship's capacity in tonnage: " + capacity + " & its name: " + getName();
	}
	
	
}
