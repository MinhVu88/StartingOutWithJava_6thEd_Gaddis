package code_listings.ch_03_decision_structures;
import javax.swing.JOptionPane;
public class VariableScope {
    public static void main(String[] args) {
        String firstName;
        firstName = JOptionPane.showInputDialog("first name: ");

        String lastName;
        lastName = JOptionPane.showInputDialog("last name: ");

        JOptionPane.showMessageDialog(null, firstName.toUpperCase() + " " + lastName.toUpperCase());

        System.exit(0);
    }
}
