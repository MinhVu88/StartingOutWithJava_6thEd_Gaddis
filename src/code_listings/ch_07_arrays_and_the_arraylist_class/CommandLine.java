package code_listings.ch_07_arrays_and_the_arraylist_class;

public class CommandLine {
	public static void main(String[] args) {
		for(int index = 0; index < args.length; index++) {
			System.out.println(args[index]);
		}
	}
}
