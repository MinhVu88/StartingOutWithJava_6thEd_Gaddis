package CodeListings.Chapter8A2ndLookAtClassesAndObjects;

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
