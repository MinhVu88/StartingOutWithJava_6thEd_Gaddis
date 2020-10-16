package CodeListings.Chapter3DecisionStructures;
import javax.swing.JOptionPane;

public class StringCompare {
    public static void main(String[] args) {
        String name1 = "Mark", name2 = "Mark", name3 = "Mary";

        // compare name1 & name2 using the String class's equal method
        if (name1.equals(name2)) {
            JOptionPane.showMessageDialog(null, name1 + " & " + name2 + " are the same");
        }else {
            JOptionPane.showMessageDialog(null, name1 + " & " + name2 + " aren't the same");
        }

        // compare name2 & name3
        if (name2.equals(name3)) {
            JOptionPane.showMessageDialog(null, name2 + " & " + name3 + " are the same");
        }else {
            JOptionPane.showMessageDialog(null, name2 + " & " + name3 + " aren't the same");
        }

        // compare name1 & name3
        if (name1.equals(name3)) {
            JOptionPane.showMessageDialog(null, name1 + " & " + name3 + " are the same");
        }else {
            JOptionPane.showMessageDialog(null, name1 + " & " + name3 + " aren't the same");
        }
        System.exit(0);
    }
}
