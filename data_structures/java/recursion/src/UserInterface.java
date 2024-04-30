import controller.*;

import javax.swing.JOptionPane;

public class UserInterface {
    public static String menu =
            """
            ----------- Recursion menu -----------
            1 - Sum of the N first integers
            2 - Smallest element of an array
            3 - Factorial of a number
            4 - Count of negative numbers in an array
            5 - Evaluate 1 + 1/2 + 1/3 + ... + 1/n
            6 - Product between two integers
            7 - Division between two integers
            8 - Count even numbers in an array
            9 - Double factorial of a number
            10 - Great common divisor (GCD)
            ---

            11 - Return to main menu
            0 - Quit
            """;

    public static void showMenu(){
        while_loop: while(true) {
            int input = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (input) {
                case 1: {
                    SumN sumN = new SumN();
                    sumN.calculate();
                }
                case 2: {
                    SmallestElement smallestElement = new SmallestElement();
                    smallestElement.calculate();
                }
                case 3: {
                    Factorial factorial = new Factorial();
                    factorial.calculate();
                }
                case 4: {
                    CountNegatives countNegatives = new CountNegatives();
                    countNegatives.calculate();
                }
                case 5: {
                    Series series = new Series();
                    series.calculate();
                }
                case 6: {
                    Product product = new Product();
                    product.calculate();
                }
                case 7: {
                    Division division = new Division();
                    division.calculate();
                }
                case 8: {
                    CountEven countEven = new CountEven();
                    countEven.calculate();
                }
                case 9: {
                    DoubleFactorial doubleFactorial = new DoubleFactorial();
                    doubleFactorial.calculate();
                }
                case 10: {
                    GCD gcd = new GCD();
                    gcd.calculate();
                }
                case 11: {
                    showMenu();
                    break while_loop;
                }
                case 0: {
                    break while_loop;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "Enter a valid option");
                }
            }
        }
    }

    public static void main(String[] args) {
        showMenu();
    }
}
