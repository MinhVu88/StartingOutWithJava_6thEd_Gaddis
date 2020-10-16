package CodeListings.Chapter10Inheritance;

public interface Relatable {
	boolean equals(GradedActivity grade);
	
	boolean isGreater(GradedActivity grade);
	
	boolean isLess(GradedActivity grade);
}
