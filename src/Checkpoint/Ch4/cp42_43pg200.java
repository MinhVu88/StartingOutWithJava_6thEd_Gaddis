package Checkpoint.Ch4;

public class cp42_43pg200 {
	public static void main(String[] args) {
		int count0 = 10;
		
		while(count0 < 1) {
			System.out.println("this prints nothing out as the loop condition is false in the 1st place");
			count0++;
		}
		
		int count1 = 0;
		
		while(count1 < 10) {
			System.out.println("this's an infinite loop");
		}
	}
}
