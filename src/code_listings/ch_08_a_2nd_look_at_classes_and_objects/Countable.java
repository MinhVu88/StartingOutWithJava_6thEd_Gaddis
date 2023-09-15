package code_listings.ch_08_a_2nd_look_at_classes_and_objects;

public class Countable {
	// if without being explicitly initialized, a static field will be assign a default value of zero
	private static int instanceCount = 0;
	
	public Countable() {
		instanceCount++;
	}

	/**
	 * @return the instanceCount
	 */
	public int getInstanceCount() {
		return instanceCount;
	}
	
}
