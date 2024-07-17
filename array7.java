//maxsubarray
import java.util.*;
public class array7 {
    public static void maxsubarray(int number[]) {
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++) {
            int start = i;
        for(int j=0;j<number.length;j++) {
            int end = j;
            currentsum = 0;
        for(int k=start;k<=end;k++) {
            currentsum += number[k];
        }
        System.out.println(currentsum);
        if(maxsum<currentsum) {
            maxsum = currentsum;
        }
        
        }    
        
            

        }
        System.out.println("max sum=" +maxsum);

    }

public static void main(String args[]) {
    int number[] = {1,- 2, 6, -1, 3} ;
    maxsubarray(number);

  }
}