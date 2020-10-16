package CodeListings.Chapter8A2ndLookAtClassesAndObjects;

// this program uses the Stock class's equals method to compare the contents of 2 Stock instances

public class StockCompare {

	public static void main(String[] args) {
		// create 2 instances of the Stock class with the same contents
		Stock company1 = new Stock("XYZ", 47.69);
		
		Stock company2 = new Stock("XYZ", 47.69);
		
		// create 2 instances of the Stock class with different contents
		Stock company3 = new Stock("ABC", 14.88);
		
		Stock company4 = new Stock("abc", 88.14);
		
		// compare the contents of company1 & company2
		if(company1.equals(company2)) {
			System.out.println("\nthe contents in the 2 instances, referenced by company1 & company2, are identical");
		}else {
			System.out.println("\nthe contents in the 2 instances, referenced by company1 & company2, are NOT identical");
		}
		
		// compare the contents of company3 & company4
		if(company3.equals(company4)) {
			System.out.println("\nthe contents in the 2 instances, referenced by company3 & company4, are identical");
		}else {
			System.out.println("\nthe contents in the 2 instances, referenced by company3 & company4, are NOT identical");
		}
	}

}
