package CodeListings.Chapter8A2ndLookAtClassesAndObjects;

/*
- So why would we want to copy an object? 

- An object copy or a clone is created if we want to modify or move an object, without affecting the original one
*/

public class ObjectCopy {

	public static void main(String[] args) {
		// version 1: use the Stock class's copy method to make a duplicate of a Stock instance (not recommended)
		Stock company5 = new Stock("DEF", 369.23);
		
		Stock company6;
		
		// make company6 reference a copy of the instance that is referenced by company5
		company6 = company5.copy();
		
		// display the contents of the 2 instances by using the Stock class's toString method
		System.out.println("\ncompany5's contents ->" + company5);
		
		System.out.println("\ncompany6's contents ->" + company6);
		
		// check whether the 2 instances (the original & the duplicate) actually exist & are referenced by the same variable or different ones
		// Note: When you use the == operator with reference variables, the operator compares the memory addresses/references that the variables contain
		// not the contents of the objects referenced by the variables
		if(company5 == company6) {
			System.out.println("\n* company5 & company6 reference the same instance");
		}else {
			System.out.println("\n* company5 & company6 reference different instances");
		}
		
		// version 2: use a copy constructor (recommended)
		Stock company7 = new Stock("GHI", 7.03);
		
		Stock company8 = new Stock(company7);
		
		System.out.println("\ncompany7's contents ->" + company7);
		
		System.out.println("\ncompany8's contents ->" + company8);
		
		if(company7 == company8) {
			System.out.println("\n* company7 & company8 reference the same instance");
		}else {
			System.out.println("\n* company7 & company8 reference different instances");
		}
	}

}
