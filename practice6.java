import java.util.Scanner;
public class practice6 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    int fact = 1 ;
    System.out.println("Enter the num");
        num = sc.nextInt();

    for(int i=1; i<=num; i++) {
        fact *= i;
        
    }

        System.out.println("factorial of " + fact);
}
}


//  import java.util.Scanner;
//  public class practice6 {
//  public static void main(String[] args) {
//  Scanner sc = new Scanner(System.in);
//  int num; // To hold number
//  int fact = 1; // To hold factorial
//  System.out.print("Enter any positive integer: ");
//  num = sc.nextInt();
//  for(int i=1; i<=num; i++) {
//  fact *= i;
//  }
//  System.out.println("Factorial: "+ fact);
//  }
//  }

