package code_listings.ch_10_inheritance;

public interface Relatable {
	boolean equals(GradedActivity grade);
	
	boolean isGreater(GradedActivity grade);
	
	boolean isLess(GradedActivity grade);
}
