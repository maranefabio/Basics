import list1.*;
import list2.*;

import javax.swing.JOptionPane;

public class Main {
    public static String mainMenu =
            """
            ----------- Menu -----------
            
            1 - List 1
            2 - List 2
            3 - List 3
            ---

            9 - Quit
            """;

    public static String menuList1 =
            """
            ----------- List 1-----------
            1 - Sum of the N first integers
            2 - Smallest element of an array 
            3 - Factorial of a number
            4 - Count of negative numbers in an array 
            5 - Evaluate 1 + 1/2 + 1/3 + ... + 1/n 
            ---

            0 - Return to main menu
            9 - Quit
            """;

    public static String menuList2 =
            """
            ----------- List 2-----------
            1 - Product of two integers
            2 - Quotient of two integers
            3 - Count of even numbers in an array
            4 - Double factorial
            5 - GCD between two integers
            ---
            
            0 - Return to main menu
            9 - Quit
            """;

    public static void showList1Menu(){
        list1_while_loop: while(true) {
            int input = Integer.parseInt(JOptionPane.showInputDialog(menuList1));
            switch (input) {
                case 1: {
                    List1Ex1 list1Ex1 = new List1Ex1();
                    list1Ex1.calculate();
                }
                case 2: {
                    List1Ex2 list1Ex2 = new List1Ex2();
                    list1Ex2.calculate();
                }
                case 3: {
                    List1Ex3 list1Ex3 = new List1Ex3();
                    list1Ex3.calculate();
                }
                case 4: {
                    List1Ex4 list1Ex4 = new List1Ex4();
                    list1Ex4.calculate();
                }
                case 5: {
                    List1Ex5 list1ex5 = new List1Ex5();
                    list1ex5.calculate();
                }
                case 0: {
                    showStartMenu();
                    break list1_while_loop;
                }
                case 9: {
                    break list1_while_loop;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "Enter a valid option");
                }
            }
        }
    }
    public static void showList2Menu(){
        list2_while_loop: while(true){
            int input = Integer.parseInt(JOptionPane.showInputDialog(menuList2));
            switch(input){
                case 1: {
                    List2Ex1 lista2Ex1 = new List2Ex1();
                    lista2Ex1.calculate();
                    break;
                }
                case 2: {
                    List2Ex2 lista2Ex2 = new List2Ex2();
                    lista2Ex2.calculate();
                    break;
                }
                case 3: {
                    List2Ex3 lista2Ex3 = new List2Ex3();
                    lista2Ex3.calculate();
                    break;
                }
                case 4: {
                    List2Ex4 lista2Ex4 = new List2Ex4();
                    lista2Ex4.calculate();
                    break;
                }
                case 5: {
                    List2Ex5 lista2Ex5 = new List2Ex5();
                    lista2Ex5.calculate();
                    break;
                }
                case 0: {
                    showStartMenu();
                    break list2_while_loop;
                }
                case 9: {
                    break list2_while_loop;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "Enter a valid option");
                }
            }
        }
    }

    public static void showStartMenu(){
        main_while_loop: while(true){
            int input = Integer.parseInt(JOptionPane.showInputDialog(mainMenu));
            switch (input){
                case 1: {
                    showList1Menu();
                    break main_while_loop;
                }
                case 2: {
                    showList2Menu();
                    break main_while_loop;
                }
                case 9: {
                    break main_while_loop;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "Enter a valid option");
                }
            }
        }
    }


    public static void main(String[] args) {
        showStartMenu();
    }
}
