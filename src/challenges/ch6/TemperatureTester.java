package challenges.ch6;
import javax.swing.JOptionPane;

public class TemperatureTester {
	public static void main(String[] args) {
		double fahTemp = Double.parseDouble(JOptionPane.showInputDialog("Fahrenheit temp:"));
		
		Temperature temp = new Temperature(fahTemp);
		
		JOptionPane.showMessageDialog(null, "Fahrenheit -> Celcius: " + temp.getCelsius());
		
		JOptionPane.showMessageDialog(null, "Fahrenheit -> Kelvin: " + temp.getKelvin());
		
		System.exit(0);
	}
}
