package challenges.ch6;

/*
- On a roulette wheel, the pockets are numbered from 0 to 36 

- The colors of the pockets are as follows:

� Pocket 0 is green

� 1 - 10, the odd numbered pockets: red & the even numbered pockets: black

� 11 - 18, the odd numbered pockets: black & the even numbered pockets: red

� 19 - 28, the odd numbered pockets: red & the even numbered pockets: black

� 29 - 36, the odd numbered pockets: black & the even numbered pockets: red

- Write a class named RoulettePocket 

- The class�s constructor should accept a pocket number

- The class should have a method named getPocketColor that returns the pocket�s color as a string

- Demonstrate the class in a program that asks the user to enter a pocket number & displays whether the pocket is green, red or black 

- The program should display an error message if the user enters a number that is outside the range of 0 through 36
*/

public class RoulettePocket {
	private int pocketNo;

	/**
	 * @param pocketNo
	 */
	public RoulettePocket(int pocketNo) {
		this.pocketNo = pocketNo;
	}

	public RoulettePocket() {
		this.pocketNo = 0;
	}

	/**
	 * @return the pocketNo
	 */
	public int getPocketNo() {
		return pocketNo;
	}

	/**
	 * @param pocketNo the pocketNo to set
	 */
	public void setPocketNo(int pocketNo) {
		this.pocketNo = pocketNo;
	}
	
	public String getPocketColor() {
		String color = "";
		
		if(this.pocketNo >= 0 && this.pocketNo <= 36) {
			if(this.pocketNo == 0) {
				color = "green";
			}else if(this.pocketNo >= 1 && this.pocketNo <= 10) {
				if(this.pocketNo % 2 == 0) {
					color = "black";
				}else {
					color = "red";
				}
			}else if(this.pocketNo >= 11 && this.pocketNo <= 18) {
				if(this.pocketNo % 2 == 0) {
					color = "red";
				}else {
					color = "black";
				}
			}else if(this.pocketNo >= 19 && this.pocketNo <= 28) {
				if(this.pocketNo % 2 == 0) {
					color = "black";
				}else {
					color = "red";
				}
			}else if(this.pocketNo >= 29 && this.pocketNo <= 36) {
				if(this.pocketNo % 2 == 0) {
					color = "red";
				}else {
					color = "black";
				}
			}
		}else {
			color = "invalid input";
		}
		
		return color;
	}
}
