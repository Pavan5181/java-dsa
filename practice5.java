import java.util.Scanner;
public class practice5 {
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num;
    int choice;
    int evenSum = 0;;
    int oddSum = 0;

    do {
        System.out.println("Enter the num");
        
        num = sc.nextInt();

        if(num%2==0){
            evenSum += num;
            
        }else {
            oddSum += num;
        }
         System.out.println("if you want to continue press 1 or exit then press 0");
         choice = sc.nextInt();

    }while(choice==1);

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

 }
 }