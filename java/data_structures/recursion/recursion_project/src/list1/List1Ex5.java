package list1;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class List1Ex5 {
    public double recursion(int n) {
        if(n==0) {
            return 0;
        }
        return recursion(n-1) + (1./n);
    }

    public void calculate() {
        int n;
        
        while(true) {
            try {
                n = Integer.parseInt(JOptionPane.showInputDialog("Enter the sum limit"));

                if(Integer.class.isInstance(n) && n > 0) {
                    break;
                }
                JOptionPane.showMessageDialog(null, "Enter a valid positive integer");
            }
            catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Enter a valid positive integer");
            }
        }
        JOptionPane.showMessageDialog(null, "Result = " + recursion(n));
    }
}
