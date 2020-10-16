package Checkpoint.Ch3;
import javax.swing.JOptionPane;

public class cp320pg151 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("what's your name? ");
        if(name.equals("Timothy")) {
            JOptionPane.showMessageDialog(null, "Do i know you?");
        }else {
            JOptionPane.showMessageDialog(null, "Oh hello tim");
        }
        System.exit(0);
    }
}
