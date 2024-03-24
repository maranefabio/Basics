package list1;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class List1Ex4 {
    public int recursion(int[] vect, int vect_size) {
        int index = vect_size-1;

        if(index < 0) {
          return 0;
        }

        if(vect[index] < 0) {
            return recursion(vect, vect_size-1) + 1; 
        }
        
        return recursion(vect, vect_size-1);
    }

    public void calculate() {
        int vect_size;

        while(true) {
            try {
                vect_size = Integer.parseInt(JOptionPane.showInputDialog("Enter the array size"));
                if(vect_size > 0) {
                    break;
                }
                JOptionPane.showMessageDialog(null, "Enter a valid size");
            }
            catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Enter a valid size");
            }
        }

        int[] vect = new int[vect_size];

        for(int i=0; i<vect_size; i++) {
            while(true) {
                try {
                    vect[i] = Integer.parseInt(JOptionPane.showInputDialog("Value for position " + i));
                    break;
                }
                catch(Exception e) {
                    JOptionPane.showMessageDialog(null, "Enter a valid element");
                }                
            }
        }
        JOptionPane.showMessageDialog(null, Arrays.toString(vect) + " contains " + recursion(vect, vect_size) + " negative numbers");
    }
}

