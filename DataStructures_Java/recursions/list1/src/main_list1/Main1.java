package main_list1;

import ex1.sumFirstN;

import javax.swing.JOptionPane;

public class Main1 {

    public Main1() {
        super();
    }

    public static int userMenu() {
        String menu_string = (
                """
                        ___________________MENU___________________
                        
                        Insert the number for the desired operation:
                                    
                        1 - Sum N first integers
                        2 - 
                        3 - 
                        4 - 
                        5 - 
                                    
                        9 - Exit
                """
        );

        return Integer.parseInt(JOptionPane.showInputDialog(menu_string));
    }

    public static void main(String[] args) {
        sumFirstN sumfirstn = new sumFirstN();

        while_loop: while(true) {
            switch (userMenu()) {
                case 1:
                    sumfirstn.calculate();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
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
