package challenges.ch10;

import code_listings.ch_10_inheritance.GradedActivity;

public interface Analyzable {
	double getAverage();
	
	GradedActivity getHighest();
	
	GradedActivity getLowest();
}
