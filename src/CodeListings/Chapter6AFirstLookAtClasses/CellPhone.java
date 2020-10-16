package CodeListings.Chapter6AFirstLookAtClasses;

public class CellPhone {
	private String manufacturer, model;
	private double retailPrice;
	
	/**
	 * @param manufacturer
	 * @param model
	 * @param retailPrice
	 */
	public CellPhone(String manufacturer, String model, double retailPrice) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.retailPrice = retailPrice;
	}

	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the retailPrice
	 */
	public double getRetailPrice() {
		return retailPrice;
	}

	/**
	 * @param retailPrice the retailPrice to set
	 */
	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}
}
