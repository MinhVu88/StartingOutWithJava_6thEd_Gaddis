package challenges.ch6;

/*
- Write a Circle class that has the following fields:

� radius: a double

� PI: a final double initialized with the value 3.14159

- The class should have the following methods:

� Constructor: Accepts the radius of the circle as an argument

� Constructor: A no-arg constructor that sets the radius field to 0.0

� setRadius: A mutator method for the radius field

� getRadius: An accessor method for the radius field

� getArea: Returns the area of the circle, which is calculated as area = PI * radius * radius

� getDiameter: Returns the diameter of the circle, which is calculated as diameter = radius * 2

� getCircumference: Returns the circumference of the circle, which is calculated as circumference = 2 * PI * radius

- Write a program that demonstrates the Circle class by asking the user for the circle�s radius, creating a Circle object 
	and then reporting the circle�s area, diameter and circumference
*/

public class Circle {
	private double radius;
	private final double PI = 3.14159;
	
	/**
	 * @param radius
	 */
	public Circle(double radius) {
		this.radius = radius;
	}

	/**
	 * 
	 */
	public Circle() {
		this.radius = 0.0;
	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return PI * Math.pow(radius, 2);
	}
	
	public double getDiameter() {
		return radius * 2;
	}
	
	public double getCircumference() {
		return 2 * PI * radius;
	}
}
