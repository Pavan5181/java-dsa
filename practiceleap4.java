import java.util.Scanner;
public class practiceleap4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");

        int year = sc.nextInt();
        if(year%100==0 && year%400==0 || year%100 !=0 && year%4==0){
            System.out.println("The year is leap year");
        }else {
            System.out.println("The year is not leap year");

        }



    }
}