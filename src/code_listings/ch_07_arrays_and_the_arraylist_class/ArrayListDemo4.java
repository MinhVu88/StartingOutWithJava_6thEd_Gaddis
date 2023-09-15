package code_listings.ch_07_arrays_and_the_arraylist_class;

import java.util.ArrayList;

public class ArrayListDemo4 {

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
		
		System.out.println("\nthe newcomer: martin bormann");
		
		circleOfEvils.add(1, "martin bormann"); // the overloaded version of the add method that allows adding an item at a specific index
		
		System.out.println("\nHitler's inner circle with the new member, martin bormann, at position #1: ");
		
		for(int index = 0; index < circleOfEvils.size(); index++) {
			System.out.println("\n\t- member #" + index + ": " + circleOfEvils.get(index));
		}
	}

}
