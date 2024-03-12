package ex1;

import javax.swing.JOptionPane;

public class sumFirstN {
    public sumFirstN() {
        super();
    }

    public int recursion(int n) {
        if (n > 0) {
            return n + recursion(n - 1);
        }
        return 0;
    }

    public void calculate() {
        int n;
        while (true) {
            n = Integer.parseInt(JOptionPane.showInputDialog("Enter a positive integer: "));

            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Sum of the first " + n + "integers = " + recursion(n));
                break;
            }
            JOptionPane.showMessageDialog(null, "Enter a positive integer");
        }
    }
}

