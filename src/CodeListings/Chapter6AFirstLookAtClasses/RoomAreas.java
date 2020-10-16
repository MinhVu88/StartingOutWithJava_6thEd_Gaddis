package CodeListings.Chapter6AFirstLookAtClasses;
import javax.swing.JOptionPane;

// this program creates 3 instances of the Rectangle class

public class RoomAreas {
	public static void main(String[] args) {
		// create 3 instances of the Rectangle class (a.k.a 3 instance variables/fields, namely, kitchen, bedroom & toilet)
		Rectangle kitchen = new Rectangle();
		Rectangle bedroom = new Rectangle();
		Rectangle toilet = new Rectangle();
		
		double number, totalArea;
		
		// get & store the dimensions of the kitchen
		number = Double.parseDouble(JOptionPane.showInputDialog("the kitchen's length:"));
		kitchen.setLength(number);
		number = Double.parseDouble(JOptionPane.showInputDialog("the kitchen's width:"));
		kitchen.setWidth(number);
		
		// get & store the dimensions of the bedroom
		number = Double.parseDouble(JOptionPane.showInputDialog("the bedroom's length:"));
		bedroom.setLength(number);
		number = Double.parseDouble(JOptionPane.showInputDialog("the bedroom's width:"));
		bedroom.setWidth(number);
		
		// get & store the dimensions of the toilet
		number = Double.parseDouble(JOptionPane.showInputDialog("the toilet's length:"));
		toilet.setLength(number);
		number = Double.parseDouble(JOptionPane.showInputDialog("the toilet's width:"));
		toilet.setWidth(number);
		
		// Calculate & display the total area of the rooms
		totalArea = kitchen.getArea() + bedroom.getArea() + toilet.getArea();
		JOptionPane.showMessageDialog(null, "the total area of the rooms: " + totalArea);
		
		System.exit(0);
	}
}
