package controller;

import javax.swing.JOptionPane;

public class Factorial {
    public int recursion(int n) {
        if(n==0) {
            return 1;
        }
        return n * recursion(n-1);
    }

    public void calculate() {
        int n;

        while(true) {
            try {
                n = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer from 0 to 12"));
                if(n > 0 && n <=12) {
                    break;
                }
                JOptionPane.showMessageDialog(null, "Enter a valid integer");
            }
            catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Enter a valid integer");
            }
        }
        JOptionPane.showMessageDialog(null, recursion(n));
    }
}
