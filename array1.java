//Linear Search
import java.util.*;
public class array1 {
    public static int linersearch(int number[],int key){
        for(int i=0;i<number.length;i++) {
            if(number[i] == key){
                return i;

            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int number[] = {2,4,6,8,10,12,14,16};
        //String menu[] = {"dosa","idali","samosa","vadapav"};
        int key = 12;

        int index = linersearch(number,key);
        if(index == -1) {
            System.out.println("not found");
        }else{
            System.out.println("key is at index :" +index);
        }
    }
}