import java.util.Scanner;

public class practice11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer number");
        int digits = sc.nextInt();
        System.out.println("the sum of digits = " + sumDigits(digits));
    }
    public static int sumDigits(int n){
        int sumDigits = 0;

        while(n>0){
            int lastDigit = n % 10;
            sumDigits += lastDigit;
            n /= 10;
        }
        return sumDigits;
    }

        
}