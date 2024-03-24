package list1;

public class List1Ex2 {
    public int recursion(int[] vect, int vect_size, int last_value) {
        int buffer = last_value;
        if(vect_size==0) {
            return buffer;
        }
        
        if(buffer>last_value) {
            return recursion(vect, vect_size-1, buffer);
        }
        return recursion(vect, vect_size-1, last_value); 
    } 
}
