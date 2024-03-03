package main;


import ex1.Product;
import ex2.Division;
import ex3.EvenInVector;
import ex4.DoubleFactorial;

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
    Product product = new Product();
    Division division = new Division();
    EvenInVector evenInVector = new EvenInVector();
    DoubleFactorial doubleFactorial = new DoubleFactorial();

    while_loop: while(true) {
      switch_statement: switch (userMenu()) {
        case 1:
          product.calculate();
          break switch_statement;
        case 2:
          division.calculate();
          break switch_statement;
        case 3:
          evenInVector.calculate();
          break switch_statement;
        case 4:
          doubleFactorial.calculate();
          break switch_statement;
        case 9:
          break switch_statement;
        default:
          JOptionPane.showMessageDialog(null, "Enter a valid number");
      }
    }
  }
}
