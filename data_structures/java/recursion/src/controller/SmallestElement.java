package controller;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class SmallestElement {
    public int recursion(int[] vect, int vect_size, int current_smallest_element) {
        int index = vect_size-1;

        if(index < 0) {
            return current_smallest_element;
        }

        if(vect[index] < current_smallest_element) {
            return recursion(vect, vect_size-1, vect[index]);
        }

        return recursion(vect, vect_size-1, current_smallest_element);
    }

    public void calculate() {
        int vect_size;

        while(true) {
            try {
                vect_size = Integer.parseInt(JOptionPane.showInputDialog("Enter the array size"));

                if(vect_size>0) {
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

        int current_smallest_element = vect[vect_size-1];
        JOptionPane.showMessageDialog(null, "Smallest element of " + Arrays.toString(vect) + " = " + recursion(vect, vect_size, current_smallest_element));
    }
}
