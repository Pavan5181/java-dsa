//pair in array 
import java.util.*;
public class array5 {
    public static void printpair(int number[]) {
        int tp = 0;
        for( int i=0;i<number.length;i++) {
            int curr = number[i]; //2,4,6,8,10
            for(int j=i+1; j<number.length;j++) {
                System.out.print("(" + curr + "," + number[j] + ")");
                tp++;
            }
            System.out.println();
        }
         System.out.println("total number of pair =" + tp);


    }


    public static void main(String args[]) { 
        int number[] = {2,4,6,8,10};
        printpair(number);
    }
}