//   import java.util.*;
//  class MultiplicationTable {
//  public static void printMultiplicationTable(int number){
//  Scanner sc = new Scanner(System.in);
//  System.out.print("Enter number:");
//  int n = sc.nextInt();
//  for(int i=1; i<=10; i++) {
//  System.out.println(n + " * " + i + " = " + n*i);
//  }
//  }
//  public static void main(String s[]) {
//  printMultiplicationTable(5);
//  }
//  }

import java.util.Scanner;
public class practice7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("enter any number");
        int n=sc.nextInt();

        for(i=1;i<=n*10; i+=n){
            System.out.println(i  );
        }
         
    }
}
 