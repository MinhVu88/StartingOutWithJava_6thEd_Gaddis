package challenges.ch8;

public class RoomDimension {
	private double width, length;
	
	// a no-arg constructor
	public RoomDimension() {}
	
	/**
	 * a copy constructor
	 * 
	 * @param anotherRoomDimensionObject a reference to a copy of a RoomDimension instance
	 */
	public RoomDimension(RoomDimension anotherRoomDimensionObject) {
		this.width = anotherRoomDimensionObject.width;
		
		this.length = anotherRoomDimensionObject.length;
	}
	
	public RoomDimension(RoomCarpet carpet) {}
	
	/**
	 * @param width
	 * @param length
	 */
	public RoomDimension(double width, double length) {
		this.width = width;
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getArea() {
		return this.width * this.length;
	}
}
