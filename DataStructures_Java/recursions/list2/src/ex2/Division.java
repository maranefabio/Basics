package ex2;

import javax.swing.JOptionPane;

public class Division {
    public Division() {
        super();
    }

    public int recursion(int dividend, int divisor) {
        if(dividend==0) {
            return 0;
        }
        else if(dividend<0 ^ divisor<0) {
            return recursion(dividend+divisor, divisor) - 1;
        }
        return recursion(dividend-divisor, divisor) + 1;
    }

    public void calculate() {
        int dividend = Integer.parseInt(JOptionPane.showInputDialog("Dividend: "));

        while(true) {
            int divisor = Integer.parseInt(JOptionPane.showInputDialog("Divisor: "));
            if(divisor != 0) {
                JOptionPane.showMessageDialog(null, dividend + " / " + divisor + " = " + recursion(dividend, divisor));
                break;
            }
            JOptionPane.showMessageDialog(null, "Divisor must not be zero. Enter the divisor again.");
        }
    }
}
