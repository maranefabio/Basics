package UserInterface;

import list1.*;
import list2.*;

import javax.swing.JOptionPane;
import java.util.function.IntBinaryOperator;

public class Main {

    public Main() {
        super();
    }

    String start_menu = (
            """
                ___________________MENU___________________
                
                Insert the number of the desired package:
                            
                1 - List 1
                2 - List 2
                3 - List 3
                9 - Exit
            """
    );

    String list1_menu = (
            """
                ___________________List 1___________________
                
                Insert the number for the desired operation:
                            
                1 - Sum the first N integers
                9 - Exit
            """
    );

    String list2_menu = (
            """
                ___________________List 2___________________
                
                Insert the number for the desired operation:
                            
                1 - Product
                2 - Division
                3 - Find the amount of even numbers in a vector
                4 - Find the double-factorial of a number
                5 - Find the GCD of two numbers 
                9 - Exit
            """
    );

    public void menuList1(){
        int user_input = Integer.parseInt(JOptionPane.showInputDialog(list1_menu));

        while_loop:
        while (true) {
            switch (user_input) {
                case 1:
                    ex1SumFirstN list1ex1 = new ex1SumFirstN();
                    list1ex1.calculate();
                    break;
                case 9:
                    break while_loop;
                default:
                    JOptionPane.showMessageDialog(null, "Enter a valid package");
            }
        }
    }

    public void menuList2(){
        int user_input = Integer.parseInt(JOptionPane.showInputDialog(list2_menu));

        while_loop:
        while (true) {
            switch (user_input) {
                case 1:
                    ex1Product ex1 = new ex1Product();
                    ex1.calculate();
                    break;
                case 1:
                    ex2Division ex2 = new ex2Division();
                    ex1.calculate();
                    break;
                case 1:
                    ex1Product ex1 = new ex1Product();
                    ex1.calculate();
                    break;
                case 1:
                    ex1Product ex1 = new ex1Product();
                    ex1.calculate();
                    break;
                case 9:
                    break while_loop;
                default:
                    JOptionPane.showMessageDialog(null, "Enter a valid package");
            }
        }
    }
    public void showMenu() {
        int user_input = Integer.parseInt(JOptionPane.showInputDialog(start_menu));

        while_loop:
        while (true) {
            switch (user_input) {
                case 1:
                    menuList1();
                    break;
                case 2:
                    menuList2();
                    break;
                case 3:
                    menuList3();
                    break;
                case 9:
                    break while_loop;
                default:
                    JOptionPane.showMessageDialog(null, "Enter a valid package");
            }
        }
    }


    public static void main(String[] args) {
        System.out.println("Done");

    }
}
