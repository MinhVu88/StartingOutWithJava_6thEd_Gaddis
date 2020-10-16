package CodeListings.Chapter3DecisionStructures;

// to print a string argument, use the %s format specifier

public class FormattingStringArguments_pg174 {
	public static void main(String[] args) {
		String name1 = "George", name2 = "Franklin", name3 = "Jay", name4 = "Ozzy", name5 = "Carmine", name6 = "Dee";
		
		System.out.println("\nThe %10s format specifier prints a string in a field that is 10 spaces wide & the strings are right-justified:\n");
		System.out.printf("%10s%10s\n", name1, name2);
		System.out.printf("%10s%10s\n", name3, name4);
		System.out.printf("%10s%10s\n", name5, name6);
		
		System.out.println("\nUse the minus flag (-) to left-justify a string within its field:\n");
		System.out.printf("%-10s%-10s\n", name1, name2);
		System.out.printf("%-10s%-10s\n", name3, name4);
		System.out.printf("%-10s%-10s\n", name5, name6);
		
	}
}
