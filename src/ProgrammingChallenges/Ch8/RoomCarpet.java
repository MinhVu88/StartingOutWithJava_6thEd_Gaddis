package ProgrammingChallenges.Ch8;

public class RoomCarpet {
	private double pricePerSquareFoot;
	
	private RoomDimension dimension;
	
	public double totalCost() {
		return this.pricePerSquareFoot * getDimension().getArea();
	}

	/**
	 * @return the pricePerSquareFoot
	 */
	public double getPricePerSquareFoot() {
		return pricePerSquareFoot;
	}

	/**
	 * @param pricePerSquareFoot the pricePerSquareFoot to set
	 */
	public void setPricePerSquareFoot(double pricePerSquareFoot) {
		this.pricePerSquareFoot = pricePerSquareFoot;
	}

	/**
	 * @return the dimension
	 */
	public RoomDimension getDimension() {
		return new RoomDimension(this.dimension);
	}

	/**
	 * @param dimension the dimension to set
	 */
	public void setDimension(RoomDimension dimension) {
		this.dimension = new RoomDimension(this.dimension);
	}
	
	// a no-arg constructor
	public RoomCarpet() {}
	
	/**
	 * copy constructor
	 * 
	 * @param pricePerSquareFoot
	 * @param dimension
	 */
	public RoomCarpet(double pricePerSquareFoot, RoomDimension dimension) {
		this.pricePerSquareFoot = pricePerSquareFoot;
		
		this.dimension = new RoomDimension(dimension);
	}

	public RoomCarpet copy() {
		RoomCarpet copiedObject = new RoomCarpet(this.pricePerSquareFoot, new RoomDimension(this.dimension));
		
		return copiedObject;
	}
}
