package code_listings.ch_03_decision_structures;
import javax.swing.JOptionPane;

public class SecretWord {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter the secret: ");

        // check whether user has enter the correct secret word
        if (input.equalsIgnoreCase("NOVUS ORDO SECLORUM")) {
                JOptionPane.showMessageDialog(null, "Welcome, you've been initiated into this fraternity");
        }else  {
                JOptionPane.showMessageDialog(null, "Get out");
        }
        System.exit(0);
    }
}
