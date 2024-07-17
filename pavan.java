import java.util.Scanner;
 public class pavan
{
    public static void main(String args[])
    {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the roll no:");
        a=sc.nextInt();

        if (a==30)
        {
            System.out.println("pavan prakash karale");
        }
        if (a==35)
        {
            System.out.println("laxman Vasantrao masale");
        }
        else
        {
            System.out.println("invalid roll no");
        }
    }
}