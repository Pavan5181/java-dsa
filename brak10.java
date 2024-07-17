import java.util.Scanner;
public class brak10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("enter your num");
            int n = sc.nextInt();

            if(n % 10 == 0){
                // break;
                continue;

            }
            System.out.println(n);
        } while(true);
        
    }
}
    