package list2;

import javax.swing.JOptionPane;

public class Main {

    public Main() {
        super();
    }

    public static int userMenu() {
        String menu_string = (
                """
                        ___________________MENU___________________
                        
                        Insert the number for the desired operation:
                                    
                        1 - Product
                        2 - Division
                        3 - Find the amount of even numbers in a vector
                        4 - Find the double-factorial of a number
                        5 - Find the GCD of two numbers
                                    
                        9 - Exit
                """
        );

        return Integer.parseInt(JOptionPane.showInputDialog(menu_string));
    }

    public static void main(String[] args) {
        ex1Product ex1 = new ex1Product();
        ex2Division ex2 = new ex2Division();
        ex3EvenInVector ex3 = new ex3EvenInVector();
        ex4DoubleFactorial ex4 = new ex4DoubleFactorial();
        ex5GCD ex5 = new ex5GCD();

        while_loop: while(true) {
            switch (userMenu()) {
                case 1:
                    ex1.calculate();
                    break;
                case 2:
                    ex2.calculate();
                    break;
                case 3:
                    ex3.calculate();
                    break;
                case 4:
                    ex4.calculate();
                    break;
                case 5:
                    ex5.calculate();
                    break;
                case 9:
                    break while_loop;
                default:
                    JOptionPane.showMessageDialog(null, "Enter a valid number");
            }
        }
        System.out.println("Done");
    }
}