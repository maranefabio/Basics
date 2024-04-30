package controller;

import javax.swing.JOptionPane;

public class GCD {

    public int recursion(int A, int B) {
        if(A==B){
            return A;
        }
        else if(B>A) {
            return recursion(B-A, A);
        }
        return recursion(A-B, B);
    }

    public void calculate() {
        int A, B;
        while(true) {
            A = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "Enter first term: "
                    )
            );
            B = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "Enter second term: "
                    )
            );
            if(A>0 && B>0){
                break;
            }
            JOptionPane.showMessageDialog(null, "Enter only positive integers.");
        }
        JOptionPane.showMessageDialog(null, "GCD(" + A + "," + B + ") = " + recursion(A, B));
    }
}
