package math;

public class recursiveOperations {

    public recursiveOperations() {
        super();
    }

    public int sumFirstN(int sum_limit) {
        if(sum_limit <= 0) {
            return 0;
        }
        return sum_limit + sumFirstN(sum_limit-1);
    }
}
