package controller;

public class MathOperations {

    public MathOperations() {
        super();
    }

    public int sumNFirst(int N) {

        // Stop condition: all sums ends in 0;
        if(N<=0) {
            return 0;
        }

        // The argument for the recursion decreases by 1 until it reaches 0
        return N + sumNFirst(N-1);
    }
}
