package ProgrammingChallenges.Ch8;

/*
- Write a class that has 3 overloaded static methods for calculating the areas of the following geometric shapes:

• circles

• rectangles

• cylinders

- Here are the formulas for calculating the area of the shapes

- Area of a circle: Area = π x r^2

	-> π: Math.PI 
	
	-> r: the circle’s radius

- Area of a rectangle: Area = Width x Length

- Area of a cylinder: Area = π x r^2 x h

	-> π: Math.PI 
	
	-> r: the radius of the cylinder’s base  
	
	-> h: the cylinder’s height

- Because the 3 methods are to be overloaded, they should each have the same name but different parameter lists 

- Demonstrate the class in a complete program
*/

public class Area {
	private static double pi = Math.PI; ;
	
	public static double area(double radius) {
		return pi * (Math.pow(radius, 2));
	}
	
	public static double area(int width, int length) {
		return width * length;
	}
	
	public static double area(double radius, double height) {
		return pi * (Math.pow(radius, 2)) * height;
	}
}
