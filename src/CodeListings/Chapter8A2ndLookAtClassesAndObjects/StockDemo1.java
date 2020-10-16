package CodeListings.Chapter8A2ndLookAtClassesAndObjects;

/* 
- this program demonstrates the Stock class's toString method

- If you write a toString method for a class, Java will automatically call the method when the object is passed as an argument to print or println

- Java also implicitly calls an object’s toString method any time you concatenate an object of the class with a string
*/
public class StockDemo1 {

	public static void main(String[] args) {
		Stock qwertyCo = new Stock("qwerty", 51.47);
		
		// display the instance's value by using the Stock class's toString method without having to explicitly invoking it here
		System.out.println(qwertyCo);
	}

}
