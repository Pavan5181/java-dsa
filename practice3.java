import java.util.Scanner;
public class  practice3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the week num between 1-7");
        int week = sc.nextInt();

        switch(week){
            case 1:
                System.out.println("The day is monday");
            break;
             case 2:
                System.out.println("The day is tuesday");
            break;
             case 3:
                System.out.println("The day is weansday");
            break;
             case 4:
                System.out.println("The day is thusday");
            break;
             case 5:
                System.out.println("The day is friday");
            break;
             case 6:
                System.out.println("The day is saturday");
            break;
             case 7:
                System.out.println("The day is sunday");
            break;
            default:
                 System.out.println("The choice is invalid please enter the num between 1-7");


        }
    }
}

