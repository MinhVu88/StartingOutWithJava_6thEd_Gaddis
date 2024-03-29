package challenges.ch9;

public class NumbersToWords {
	private static final String[] UNITS = {" ", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine", " ten",
											" eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen", " eighteen", " nineteen"};
	
	private static final String[] TENS = {" ", " ten", " twenty", " thirty", " fourty", " fifty", " sixty", " seventy", " eighty", " ninety"};
	
	private static final String[] SPECIAL_NAMES = {" ", " thousand", " million", " billion", " trillion", " quadrillion", " quintillion"};
	
	private String lessThanOneThousand(int number) {
		String current;
		
		if(number % 100 < 20) {
			current = UNITS[number % 100];
			
			number /= 100;
		}else {
			current = UNITS[number % 10];
			
			number /= 10;
			
			current = TENS[number % 10] + current;
			
			number /= 10;
		}
		
		if(number == 0) {
			return current;
		}
		
		return UNITS[number] + " hundred and" + current;
	}
	
	public String convert(int number) {
		if(number == 0) {
			return "zero";
		}
		
		String prefix = "";
		
		if(number < 0) {
			number = -number;
			
			prefix = "negative";
		}
		
		String current = "";
		
		int place = 0;
		
		do {
			int no = number % 1000;
			
			if(no != 0) {
				String str = lessThanOneThousand(no);
				
				current = str + SPECIAL_NAMES[place] + current;
			}
			
			place++;
			
			number /= 1000;
		} while (number > 0);
		
		return (prefix + current).trim();
	}

}
