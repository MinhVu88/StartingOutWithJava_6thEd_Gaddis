package code_listings.ch_07_arrays_and_the_arraylist_class;

import java.util.ArrayList;

public class ArrayListDemo5 {

	public static void main(String[] args) {
		ArrayList<String> circleOfEvils = new ArrayList<>();
		
		circleOfEvils.add("heinrich himmler");
		
		circleOfEvils.add("reinhard heydrich");
		
		circleOfEvils.add("joseph goebbels");
		
		circleOfEvils.add("herman goering");
		
		circleOfEvils.add("albert speer");
		
		circleOfEvils.add("rudolf hess");
		
		System.out.println("\nHitler's inner circle: ");
		
		for(int index = 0; index < circleOfEvils.size(); index++) {
			System.out.println("\n\t- member #" + index + ": " + circleOfEvils.get(index));
		}
		
		System.out.println("\nreplace reinhard heydrich with heinrich muller");
		
		circleOfEvils.set(1, "heinrich muller");
		
		System.out.println("\nHitler's inner circle with reinhard heydrich replaced by heinrich muller, at position #1: ");
		
		for(int index = 0; index < circleOfEvils.size(); index++) {
			System.out.println("\n\t- member #" + index + ": " + circleOfEvils.get(index));
		}
		
	}

}
