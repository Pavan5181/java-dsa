// print subarray  
import java.util.*;
public class array6 {
    public static void subarray(int number[]) {
        int tp = 0;
        for(int i=0;i<number.length;i++) {
            int start = i;
            for(int j=i;j<number.length;j++) {
                int end = j;
                for(int k=start; k<=end;k++) { //print only
                    System.out.print(number[k]+" "); //subarray
                }
                tp++;
                 System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarray=" +tp);

    }
 public static void main(String args[]) {
    int number[] = {2,4,6,8,10} ;
    subarray(number);

  }
}