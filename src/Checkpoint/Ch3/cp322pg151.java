package Checkpoint.Ch3;
import javax.swing.JOptionPane;

public class cp322pg151 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("what's your name? ");
        if(name.equalsIgnoreCase("Timothy")) {
            JOptionPane.showMessageDialog(null, "Do i know you?");
        }else {
            JOptionPane.showMessageDialog(null, "Oh hi there");
        }
        System.exit(0);
    }
}
