package code_listings.ch_08_a_2nd_look_at_classes_and_objects;

public class EnumDemo {
	
	enum day {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}; // the ordinal positions: 0 1 2 3 4 5 6
	
	public static void main(String[] args) {
		day workingDay = day.WEDNESDAY;
		
		System.out.println("\n" + workingDay + " is a working day");
		
		System.out.println("\nthe ordinal value for " + day.SUNDAY + " is " + day.SUNDAY.ordinal());
		
		System.out.println("\nthe ordinal value for " + day.THURSDAY + " is " + day.THURSDAY.ordinal());
		
		if(day.MONDAY.compareTo(day.FRIDAY) > 0) {
			System.out.println("\n" + day.MONDAY + " > " + day.FRIDAY);
		}else {
			System.out.println("\n" + day.MONDAY + " < " + day.FRIDAY);
		}
	}

}
