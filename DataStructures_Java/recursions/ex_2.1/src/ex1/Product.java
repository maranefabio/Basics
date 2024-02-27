package ex1;

import javax.swing.JOptionPane;

public class Product {

    public Product() {
        super();
    }

    public int recursion(int A, int B) {
        if(A==0) {
            return 0;
        }
        return B + recursion(A - 1, B);
    }

    public void calculate() {
        int A = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "First term: "
                )
        );
        int B = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Second term: "
                )
        );

        JOptionPane.showMessageDialog(
                null, A + " + " + "B = " + recursion(A, B)
        );
    }
}
