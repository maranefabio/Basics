package list1;

import javax.swing.JOptionPane;
public class List1Ex1 {
    public List1Ex1(){
        super();
    }

    public int recursion(int n){
        // Stop condition: the result persists when adding zero
        if(n==0){
            return 0;
        }

        // The recall aims to subtract the input, one-by-one, to achieve the stop condition
        // n + (n-1)
        // n + (n-1) + (n-2)
        // ...
        // n + (n-1) + (n-2) + ... + 0
        return n + recursion(n-1);
    }

    public void calculate(){
        while(true){
            int input = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer:"));

            if(input>=0){
                recursion(input);
                break;
            }
            JOptionPane.showMessageDialog(null, "Only integers accepted.");
        }
    }
}

