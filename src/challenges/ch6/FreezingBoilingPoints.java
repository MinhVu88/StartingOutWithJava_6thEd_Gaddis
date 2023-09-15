package challenges.ch6;

/*
- The following table lists the freezing and boiling points of several substances:

Substance 			Freezing Point 		Boiling Point
------------------------------------------------------
Ethyl Alcohol 			�173 				172

Oxygen 					�362 				�306

Water 					 32 				212

- Design a class that stores a temperature in a temperature field and has the appropriate accessor and mutator methods for the field 

- In addition to appropriate constructors, the class should have the following methods:

� isEthylFreezing: This method should return the boolean value true if the temperature stored in the temperature field is at or below the freezing point of ethyl alcohol.
Otherwise, the method should return false

� isEthylBoiling: This method should return the boolean value true if the temperature stored in the temperature field is at or above the boiling point of ethyl alcohol.
Otherwise, the method should return false

� isOxygenFreezing: This method should return the boolean value true if the temperature stored in the temperature field is at or below the freezing point of oxygen.
Otherwise, the method should return false

� isOxygenBoiling: This method should return the boolean value true if the temperature stored in the temperature field is at or above the boiling point of oxygen. 
Otherwise, the method should return false

� isWaterFreezing: This method should return the boolean value true if the temperature stored in the temperature field is at or below the freezing point of water. 
Otherwise, the method should return false

� isWaterBoiling: This method should return the boolean value true if the temperature stored in the temperature field is at or above the boiling point of water. 
Otherwise, the method should return false

- Write a program that demonstrates the class 

- The program should ask the user to enter a temperature and then display a list of the substances that will freeze at that temperature 
and those that will boil at that temperature 

- For example, if the temperature is �20 the class should report that water will freeze and oxygen will boil at that temperature
*/

public class FreezingBoilingPoints {
	private double temperature;

	/**
	 * @param temperature
	 */
	public FreezingBoilingPoints(double temperature) {
		this.temperature = temperature;
	}

	public FreezingBoilingPoints() {
		temperature = 0.0;
	}

	/**
	 * @return the temperature
	 */
	public double getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	public boolean isEthylFreezing(double temp) {
		final int freezingPoint = -173;
		boolean status;
		
		this.temperature = temp;
		
		if(this.temperature <= freezingPoint) {
			status = true;
		}else {
			status = false;
		}
		
		return status;
	}
	
	public boolean isEthylBoiling(double temp) {
		final int boilingPoint = 172;
		boolean status;
		
		this.temperature = temp;
		
		if(this.temperature >= boilingPoint) {
			status = true;
		}else {
			status = false;
		}
		
		return status;
	}
	
	public boolean isOxygenFreezing(double temp) {
		final int freezingPoint = -362;
		boolean status;
		
		this.temperature = temp;
		
		if(this.temperature <= freezingPoint) {
			status = true;
		}else {
			status = false;
		}
		
		return status;
	}
	
	public boolean isOxygenBoiling(double temp) {
		final int boilingPoint = -306;
		boolean status;
		
		this.temperature = temp;
		
		if(this.temperature >= boilingPoint) {
			status = true;
		}else {
			status = false;
		}
		
		return status;
	}
	
	public boolean isWaterFreezing(double temp) {
		final int freezingPoint = 32;
		boolean status;
		
		this.temperature = temp;
		
		if(this.temperature <= freezingPoint) {
			status = true;
		}else {
			status = false;
		}
		
		return status;
	}
	
	public boolean isWaterBoiling(double temp) {
		final int boilingPoint = 212;
		boolean status;
		
		this.temperature = temp;
		
		if(this.temperature >= boilingPoint) {
			status = true;
		}else {
			status = false;
		}
		
		return status;
	}
}
