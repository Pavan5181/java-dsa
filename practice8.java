import java.util.Scanner;
public class practice8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the first num");
         double x = sc.nextDouble();
         System.out.println("Enter the second num");
         double y = sc.nextDouble();
         System.out.println("Enter the third num");
         double z = sc.nextDouble();

    }
    public static double Avg(double x, double y, double z){
        return(x+y+z)/3;
    }
         

}