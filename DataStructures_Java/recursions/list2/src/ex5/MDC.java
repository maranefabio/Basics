package ex5;

import javax.swing.JOptionPane;

public class MDC {

    public MDC() {
        super();
    }

    public int recursion(int A, int B) {
        return 0;
    }

    public void calculate() {
        int A = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Enter first term: "
                )
        );

        int B = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Enter second term: "
                )
        );
    }
}
