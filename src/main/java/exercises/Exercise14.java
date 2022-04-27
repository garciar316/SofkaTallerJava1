package exercises;

import util.Operations;

import javax.swing.*;

public class Exercise14 extends Operations {
    public static void main(String[] args) {
        int number;
        number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
        JOptionPane.showMessageDialog(null, upTo1000WithJumps(number));
    }
}
