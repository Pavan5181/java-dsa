import java.util.*;
public class function{
    public static void printHelloWorld() {
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        // if your function not void then return is imp;

    }
    public static int calculatesum(int num1, int num2) {  //parameter or formal parameter     
        int sum = num1+num2;
        // System.out.println("sum is :" +sum);
        return sum;

    }
    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculatesum(a,b);// argument or actual argument
        System.out.println("sum is :" +sum);
       

        // printHelloWorld(); 
         // call the function
// void is a return type means empty
//main resrved kayword
        
           
    }
}