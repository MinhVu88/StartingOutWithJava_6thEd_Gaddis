package CodeListings.Chapter10Inheritance;

public class CompactDisc implements RetailItem {
	private String title, artist;
	
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
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}

	/**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {
		this.artist = artist;
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

	public CompactDisc() {}

	/**
	 * @param title
	 * @param artist
	 * @param retailPrice
	 */
	public CompactDisc(String title, String artist, double retailPrice) {
		this.title = title;
		
		this.artist = artist;
		
		this.retailPrice = retailPrice;
	}

}
