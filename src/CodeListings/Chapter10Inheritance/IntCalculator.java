package CodeListings.Chapter10Inheritance;

/* 
- this's a functional interface as it has just 1 abstract method that is calculate()

- with a functional interface, we don't have to define a class that implements an interface or use anonymous inner class

- instead we use a lambda expression to create an object that implements the interface & overrides its abstract method

- think of a lambda expression as an anonymous method or a no-name method

- like regular methods, lambda expressions can accept arguments & return values

- the general format of a lambda expression: parameter -> expression

- example 1: x -> x * x (x: the parameter variable & x * x: the returned value)

- example 2: IntCalculator square = x -> x * x

- IntCalculator square: the declaration of an IntCalculator interface reference variable named square

- x -> x * x: a lambda expression that creates an object with the following characteristics:

	+ a reference of the object is assigned to square, so the object automatically implements the IntCalculator interface
	
	+ there's only 1 abstract method in the interface, the lambda expression will implement that method
	
	+ x represents the int argument that's passed to the method (no need to specify x's data type as the compiler will handle that)
	
	+ x * x: the returned value from the method
*/

interface IntCalculator {
	int calculate(int number);
}
