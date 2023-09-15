package code_listings.ch_08_a_2nd_look_at_classes_and_objects;

// this class uses the CarType & CarColor enumerated types

public class SportsCar {
	private CarType brands;
	
	private CarColors colors;
	
	private double price;

	/**
	 * @param brands
	 * @param colors
	 * @param price
	 */
	public SportsCar(CarType brands, CarColors colors, double price) {
		this.brands = brands;
		
		this.colors = colors;
		
		this.price = price;
	}

	/**
	 * @return the brands
	 */
	public CarType getBrands() {
		return brands;
	}

	/**
	 * @param brands the brands to set
	 */
	public void setBrands(CarType brands) {
		this.brands = brands;
	}

	/**
	 * @return the colors
	 */
	public CarColors getColors() {
		return colors;
	}

	/**
	 * @param colors the colors to set
	 */
	public void setColors(CarColors colors) {
		this.colors = colors;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "\nbrands = " + brands + ", colors = " + colors + " & price = $" + price;
	}
}
