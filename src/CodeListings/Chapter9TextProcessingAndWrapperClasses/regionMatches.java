package CodeListings.Chapter9TextProcessingAndWrapperClasses;

public class regionMatches {

	public static void main(String[] args) {
		String str1 = "give a man a gun and he can rob a bank";
		
		String str2 = "give him a bank and he can rob the whole world";
		
		System.out.println("\nstr1 length: " + str1.length() + " & str2 length: " + str2.length());
		
		String str3 = "i believe power belongs to those who dare to take it at all cost";
		
		String str4 = "I BELIEVE POWER BELONGS TO THOSE WHO DARE TO TAKE IT AT ALL COST";
		
		System.out.println("\nstr3 & str4 length: " + str3.length());
		
		/* version 1: the specified region of str1 begins at position 28, str2 at 27
		   
		   both regions have a length of 3 characters
		   
		   because the 2 regions match, the method returns true
		   
		   this version performs a case-sensitive comparison
		*/
		if(str1.regionMatches(28, str2, 27, 3)) {
			System.out.println("\n\tthe regions match");
		}else {
			System.out.println("\n\tthe regions don't match");
		}
		
		/* version 2: an additional argument indicates whether to perform a case-insensitive comparison
		 	
		 	The first argument passed to this version of the regionMatches method can be true or false, 
		 	indicating whether a case-insensitive comparison should be performed
		 	
		 	In this example, true is passed, so case will be ignored
		*/
		if(str3.regionMatches(true, 11, str4, 11, 5)) {
			System.out.println("\n\tthe regions match");
		}else {
			System.out.println("\n\tthe regions don't match");
		}
	}

}
