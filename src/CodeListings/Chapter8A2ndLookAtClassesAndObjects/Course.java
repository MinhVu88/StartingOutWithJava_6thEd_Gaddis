package CodeListings.Chapter8A2ndLookAtClassesAndObjects;

/* 
 * an aggregate class/object contains references to objects from other classes & has ownership of those classes
 * the Course class is an aggregate class & instances of this class are aggregate objects
 * 
 * private fields such as instructor & textbook in an aggregate class are called field objects
 * a field object is a variable that references objects of a particular class & holds memory addresses of those instances
 * 
 * the relationship between the Course, Instructor & TextBook classes is considered a "has-a" & "whole-part" relationship
 * in this context, the Course class & its instances own/contain the Instructor & TextBook classes/instances
 * for example, a math course has a math teacher & math textbooks => the teacher & textbooks are parts that make up the course
 * without a math course, there wouldn't be any math teacher or math textbooks
 * 
 * when the Course class & its instances want to modify something about the Instructor or TextBook classes/instances
 * copies of the Instructor or TextBook instances will be created to receive changes (thru the creation of a copy constructor in each of the classes)
 * the copies could be seen as a layer between the Course class & the other 2 classes (Instructor & TextBook)
 * this layer has 2 main functions: 1st, it reflects modifications made to the copies & 2nd, it protects the source data in those 2 classes
 * with this approach, the source data will remain intact & secure
 * otherwise, security holes/issues may arise for those 2 classes
 * 
 * a reference copy creates a copy of a reference variable that holds the memory address of a class's instance
 * an object copy creates a copy of the object itself
 * 
 * when a copy of an aggregate object is created, copies of instances that it references must also be made => a deep copy
 * when a copy of an aggregate object is created but only reference copies of instances that it references are made => a shallow copy (security holes)
 * 
 * when a method in an aggregate class is called, it should return a reference to a copy of a field object to the method call, not the field object itself
 * otherwise, security issues may arise
 */

public class Course {
	private String courseName; // String objects are immutable
	
	// a field object that purposely references a copy of an Instructor instance & holds the memory address of that copy
	// currently the field object hasn't referenced any object yet
	private Instructor instructor;
	
	// a field object that purposely references a copy of a TextBook instance & holds the memory address of that copy
	// currently the field object hasn't referenced any object yet
	private TextBook textbook;

	/**
	 * @param courseTitle holds a reference to a String object containing the course name
	 * @param mentor holds a reference to an Instructor object
	 * @param book holds a reference to a TextBook object
	 */
	public Course(String courseTitle, Instructor mentor, TextBook book) {
		this.courseName = courseTitle;
		
		// mentor is passed to the Instructor class's copy constructor as an argument
		// this creates a copy of an Instructor object, whose reference is then assigned to the instructor field object
		this.instructor = new Instructor(mentor);
		
		// text is passed to the TextBook class's copy constructor as an argument
		// this creates a duplicate of a TextBook object, whose reference is then assigned to the textbook field object
		this.textbook = new TextBook(book);
	}

	@Override
	public String toString() {
		return "\nCourse name: " + courseName + "\n\ninstructor info: " + instructor + "\n\ntextbook info: " + textbook;
	}

	/**
	 * it's ok to return a reference to a String instance to a method call, even if that instance is a private field
	 * because String objects are immutable
	 * meaning that their values/contents can't be changed
	 * thus a security hole won't occur in this case
	 * 
	 * @return a reference to a String object to a method call
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * the instructor field is passed to the Instructor class's copy constructor as an argument
	 * therefore the object created here is a copy of an Instructor object
	 * this copied object's reference will be returned to wherever the method is called
	 * 
	 * this procedure is better than returning a reference to the private field object itself (ex: return instructor;)
	 * because the instructor field holds the memory address of an Instructor object
	 * and if any reference variable outside the Course class obtains this address, 
	 * then that variable can access the Instructor object directly & can potentially change the object's contents
	 * this is a security hole
	 * 
	 * @return a reference to/memory address of a copied instance of the Instructor class to a method call
	 */
	public Instructor getInstructor() {
		return new Instructor(this.instructor);
	}

	/**
	 * the textbook field is passed to the TextBook class's copy constructor as an argument
	 * the object created here is a copy of a TextBook object
	 * 
	 * @return a reference to/memory address of a copied instance of the TextBoob class to a method call
	 */
	public TextBook getTextbook() {
		return new TextBook(this.textbook);
	}
	
}
