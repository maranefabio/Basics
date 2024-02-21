package view;

import controller.MathOperations;
import javax.swing.JOptionPane;


public class UserInterface {

    public static void userInput() {

        int input = Integer.parseInt(
                JOptionPane.showInputDialog(
                        """
                                MENU
                                1-Sum N first integers
                                9-Exit
                        """
                )
        );

        MathOperations mathOperations = new MathOperations();

        switch (input) {
            case 1:
                int n = Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "Enter the limit for the sum (N)"
                        )
                );
                System.out.println(mathOperations.sumNFirst(n));
                break;

            case 9:
                break;
        }
    }

    public static void main(String[] args) {
        userInput();
    }
}
