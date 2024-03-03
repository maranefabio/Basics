package ex3;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class EvenInVector {

    public EvenInVector() {
        super();
    }

    public int recursion(int vector_size, int[] vector) {
        if(vector_size == 0) {
            return 0;
        }
        else if (vector[vector_size - 1] % 2 == 0) {
            return 1 + recursion(vector_size - 1, vector);
        }
        return recursion(vector_size - 1, vector);
    }

    public void calculate() {
        int vector_size = 0;

        while(true) {
            vector_size = Integer.parseInt(JOptionPane.showInputDialog("Enter the vector size: "));
            if(vector_size>0){
                break;
            }
            JOptionPane.showMessageDialog(
                    null, "Vector size cannot be less than 1. Enter it again."
            );
        }

        int[] vector = new int[vector_size];
        for(int i=0; i<vector_size; i++) {
            while(true) {
                int input = Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "Enter positive integer number (position  " + i + "):"
                        )
                );
                if(input>0){
                    vector[i] = input;
                    break;
                }
                JOptionPane.showMessageDialog(
                        null, "Only positive integers allowed. Enter again."
                );
            }
        }
        JOptionPane.showMessageDialog(
                null, "The vector " + Arrays.toString(vector) +
                        " contains " + recursion(vector_size, vector) + " even numbers."
        );
    }
}
