package code_listings.ch_11_exceptions_and_advanced_fileio;

/*
- Quite often, a method will call another method, which will call yet another method

- The call stack is an internal list of all the methods that are currently executing

- When an exception is thrown by a method that is executing under several layers of method calls, 
	it is sometimes helpful to know which methods were responsible for the method being called
	
- A stack trace is a list of all the methods in the call stack 

- It indicates the method that was executing when an exception occurred & all of the methods that were called in order to execute that method
*/

/*
- this program has 3 methods: main, myMethod & produceError 

- The main method calls myMethod, which calls produceError 

- The produceError method causes an exception by passing an invalid position number to the String class�s charAt method 

- The exception is not handled by the program but is dealt with by the default exception handler

- When the exception occurs, the error message shows a stack trace listing the methods that were called in order to produce the exception 

- charAt is the 1st method that is listed in the stack trace & is responsible for the exception 

- Next, produceError is the method that called charAt 

- Next, myMethod is the method that called produceError 

- Finally, main is the method that called myMethod 

- The stack trace shows the chain of methods that were called when the exception was thrown
*/

// Note: All exception objects have a printStackTrace method, inherited from the Throwable class, which can be used to print a stack trace

public class StackTrace {

	public static void main(String[] args) {
		System.out.println("\ncalling myMethod()");
		
		myMethod();
		
		System.out.println("\nmain() is done");
	}
	
	private static void myMethod() {
		System.out.println("\ncalling produceError()");
		
		produceError();
		
		System.out.println("\nmyMethod() is done");
	}
	
	private static void produceError() {
		String str = "abc";
		
		System.out.println(str.charAt(3));
		
		System.out.println("\nproduceError() is done");
	}
}
