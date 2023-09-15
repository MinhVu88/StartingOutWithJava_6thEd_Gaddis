package code_listings.ch_03_decision_structures;

/* By default, when a number is shorter than the field in which it is displayed, the number is right-justified within that field 
   If you want a number to be left-justified within its field, you insert a minus sign (-) flag into the format specifier
*/

public class LeftJustified {
	public static void main(String[] args) {
		int no1 = 123, no2 = 12, no3 = 45678, no4 = 456, no5 = 1234567, no6 = 1234;
		
		System.out.println("\neach variable RIGHT-JUSTIFIED in a field width of 8 spaces:\n");
		System.out.printf("\tno1:%8d - no2:%8d\n", no1, no2);
		System.out.printf("\tno3:%8d - no4:%8d\n", no3, no4);
		System.out.printf("\tno5:%8d - no6:%8d\n", no5, no6);
		
		System.out.println("\neach variable LEFT-JUSTIFIED in a field width of 8 spaces:\n");
		System.out.printf("\tno1:%-8d- no2:%-8d|\n", no1, no2);
		System.out.printf("\tno3:%-8d- no4:%-8d|\n", no3, no4);
		System.out.printf("\tno5:%-8d- no6:%-8d|\n", no5, no6);
	}
}
