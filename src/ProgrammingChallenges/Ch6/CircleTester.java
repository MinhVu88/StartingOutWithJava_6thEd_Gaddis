package ProgrammingChallenges.Ch6;
import javax.swing.JOptionPane;

public class CircleTester {
	public static void main(String[] args) {
		double radius1 = Double.parseDouble(JOptionPane.showInputDialog("enter the radius of circle 1:"));
		
		Circle c1 = new Circle(radius1);
		
		JOptionPane.showMessageDialog(null, "the area of the circle 1: " + c1.getArea());
		
		JOptionPane.showMessageDialog(null, "the diameter of the circle 1: " + c1.getDiameter());
		
		JOptionPane.showMessageDialog(null, "the circumference of the circle 1: " + c1.getCircumference());
		
		double radius2 = Double.parseDouble(JOptionPane.showInputDialog("enter the radius of circle 2:"));
		
		Circle c2 = new Circle();
		
		c2.setRadius(radius2);
		
		JOptionPane.showMessageDialog(null, "the area of the circle 2: " + c2.getArea());
		
		JOptionPane.showMessageDialog(null, "the diameter of the circle 2: " + c2.getDiameter());
		
		JOptionPane.showMessageDialog(null, "the circumference of the circle 2: " + c2.getCircumference());
		
		System.exit(0);
	}
}
