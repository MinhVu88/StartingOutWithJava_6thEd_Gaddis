package code_listings.ch_08_a_2nd_look_at_classes_and_objects;

public class TextBook {
	private String title, author, publisher;
	
	// a no-args constructor
	public TextBook() {
		this.title = "";
		
		this.author = "";
		
		this.publisher = "";
	}

	/**
	 * @param title
	 * @param author
	 * @param publisher
	 */
	public TextBook(String title, String author, String publisher) {
		this.title = title;
		
		this.author = author;
		
		this.publisher = publisher;
	}

	/**
	 * this constructor makes copies of a particular instance of the TextBook class -> a copy constructor
	 * 
	 * @param anotherTextbookObject a reference to a copy of a TextBook object, passed to the copy constructor as an argument
	 */
	public TextBook(TextBook anotherTextbookObject) {
		this.title = anotherTextbookObject.title;
		
		this.author = anotherTextbookObject.author;
		
		this.publisher = anotherTextbookObject.publisher;
	}

	@Override
	public String toString() {
		return "title = " + title + ", author = " + author + ", publisher = " + publisher;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
}
