package ProgrammingChallenges.Ch6;

/*
- Write a class named Car that has the following fields:

• yearModel: The yearModel field is an int that holds the car’s year model

• make: The make field references a String object that holds the make of the car

• speed: The speed field is an int that holds the car’s current speed

- In addition, the class should have the following constructor & other methods:

• Constructor: The constructor should accept the car’s year model & make as arguments. These values should be assigned to the object’s yearModel & make fields. The
constructor should also assign 0 to the speed field

• Accessors: Appropriate accessor methods should get the values stored in an object’s yearModel, make & speed fields

• accelerate: The accelerate method should add 5 to the speed field each time it is called

• brake: The brake method should subtract 5 from the speed field each time it is called

- Demonstrate the class in a program that creates a Car object & then calls the accelerate method 5 times 

- After each call to the accelerate method, get the current speed of the car & display it 

- Then call the brake method 5 times 

- After each call to the brake method, get the current speed of the car & display it
*/

public class Car {
	private int yearModel, currentSpeed;
	private String make;
	
	/**
	 * @param yearModel
	 * @param make
	 */
	public Car(int yearModel, String make) {
		this.yearModel = yearModel;
		this.make = make;
		currentSpeed = 0;
	}

	/**
	 * @return the yearModel
	 */
	public int getYearModel() {
		return yearModel;
	}

	/**
	 * @return the currentSpeed
	 */
	public int getCurrentSpeed() {
		return currentSpeed;
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}
	
	public void accelerate() {
		currentSpeed += 5;
	}
	
	public void brake() {
		currentSpeed -= 5;
	}
}
