package code_listings.ch_05_methods;

public class LocalVars {
	public static void main(String[] args) {
		texas();
		california();
	}
	
	public static void texas() {
		int guns = 9000; // local var
		
		System.out.println("\nin Texas there are " + guns + " guns");
	}
	
	public static void california() {
		int guns = 10000; // local var
		
		System.out.println("\nin california there are " + guns + " guns");
	}
}
