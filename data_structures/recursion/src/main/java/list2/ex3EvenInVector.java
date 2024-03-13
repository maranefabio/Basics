package list2;

import javax.swing.JOptionPane;

public class ex3EvenInVector {

    public ex3EvenInVector() {
        super();
    }

    public int recursion(int n) {
        if(n==1) {
            return 1;
        }
        else if(n==2) {
            return 2;
        }

        return n * recursion(n-2);
    }

    public void calculate() {
        while(true) {
            int n = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "Enter a positive integer: "
                    )
            );

            if(n>0){
                JOptionPane.showMessageDialog(
                        null, n + "!! = " + recursion(n)
                );
                break;
            }
            JOptionPane.showMessageDialog(
                    null, "Only positive integers allowed. Enter again."
            );
        }
    }
}