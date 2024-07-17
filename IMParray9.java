 //method three kadanes sum current sum and maximum sum
 // kadanes is imp placement point of view
import java.util.*;
public class IMParray9 {
//     public static void maxsubarray(int numbers[]) {
//         int currentsum = 0;
//         int maxsum = Integer.MIN_VALUE;
//         int prefix[] = new int[numbers.length];
    

//         prefix[0] = numbers[0];
//         // calculate prefix array
//         for(int i=1; i<prefix.length;i++ ){
//             prefix[i] = prefix[i-1] + numbers[i];
//         }


//         for(int i=0;i<numbers.length;i++) {
//             int start = i;
//         for(int j=0;j<numbers.length;j++) {
//             int end = j;
//             currentsum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
//         // for(int k=start;k<=end;k++) {  //print only
//         //     currentsum += number[k];   //subarray
//         // }
       
//         if(maxsum<currentsum) {
//             maxsum = currentsum;
//         }
        
//     } 
// }
//         System.out.println("max sum=" +maxsum);

//   }
public static void kadanes(int numbers[]){
    int ms = Integer.MIN_VALUE;
    int cs = 0;
    for(int i=0;i<numbers.length;i++){
        cs = cs + numbers[i];
        if(cs < 0) {
            cs = 0;

        }
        ms = Math.max(cs,ms);
    }
    System.out.println("our max subarray sum is :" +ms);

}

public static void main(String args[]) {
    int number[] = {-2,-3,4,-1,-2,1,5,-3} ;
    kadanes(number);

  }
}   
        
            

        