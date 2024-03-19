package list2;

import javax.swing.JOptionPane;

public class List2Ex1 {

    public List2Ex1() {
        super();
    }

    public int recursion(int A, int B) {
        if(A==0) {
            return 0;
        }
        return B + recursion(A - 1, B);
    }

    public void calculate() {
        while(true) {
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
            if(A!=0 && B!=0) {
                JOptionPane.showMessageDialog(
                        null, A + " * " + B + " = " + recursion(A, B)
                );
                break;
            }
        }
        JOptionPane.showMessageDialog(
                null, "Enter valid numbers."
        );
    }
}