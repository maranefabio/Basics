package main_list2;


import ex1.Product;
import ex2.Division;
import ex3.EvenInVector;
import ex4.DoubleFactorial;
import ex5.MDC;

import javax.swing.JOptionPane;

public class Main2 {

  public Main2() {
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
    MDC mdc = new MDC();

    while_loop: while(true) {
      switch (userMenu()) {
        case 1:
          product.calculate();
          break;
        case 2:
          division.calculate();
          break;
        case 3:
          evenInVector.calculate();
          break;
        case 4:
          doubleFactorial.calculate();
          break;
        case 5:
          mdc.calculate();
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
