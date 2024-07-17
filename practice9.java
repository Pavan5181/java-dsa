import java.util.Scanner;
public class practice9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the interger num");
        num =sc.nextInt();

        if(isEven(num)){
            System.out.println("Num is even");
        }else{
            System.out.println("Num is odd");
        }
    }
    public static boolean isEven(int num){
        if(num % 2 == 0){
            return true;

        }else{
            return false;
        }
        
    }
}