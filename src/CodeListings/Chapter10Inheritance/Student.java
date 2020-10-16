package CodeListings.Chapter10Inheritance;

/*
- The Student class is an abstract class that holds general data about a student 

- Classes representing specific types of students should inherit from this class
*/

public abstract class Student {
	private String name, id;
	
	private int yearAdmitted;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the yearAdmitted
	 */
	public int getYearAdmitted() {
		return yearAdmitted;
	}

	/**
	 * @param yearAdmitted the yearAdmitted to set
	 */
	public void setYearAdmitted(int yearAdmitted) {
		this.yearAdmitted = yearAdmitted;
	}

	/**
	 * @param name
	 * @param id
	 * @param yearAdmitted
	 */
	public Student(String name, String id, int yearAdmitted) {
		this.name = name;
		
		this.id = id;
		
		this.yearAdmitted = yearAdmitted;
	}

	@Override
	public String toString() {
		return "\nName: " + this.name + " - Id: " + this.id + " - Year admitted: " + this.yearAdmitted;
	}
	
	/**
	 * this abstract method must be overridden in a subclass
	 * 
	 * @return the remaining hours for a student
	 */
	public abstract int getRemainingHours();
}
