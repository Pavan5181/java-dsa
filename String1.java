import java.util.Scanner;
public class String1 {

public static void printLetters(String str){
    for(int i=0;i<str.length();i++) {
        System.out.print(str.charAt(i) + " ");
    }
    System.out.println();

}

    public static void main(String[] args) {
        // char arr[] = {'a','b','c'};
        // String str = "xtz";
        // String Str1 = new String("xyz");

        // Scanner sc = new Scanner(System.in);
        // String name;
        // // name = sc.next();
        // name = sc.nextLine();
        // System.out.println(name);

        // //length
        // String Fullname = "pavan bhai";
        // System.out.println(Fullname.length());

        //concatanation
         String first = "pavan";
         String second = "karale";
         String fullString = first + " " + second;
        //  System.out.println(fullString);
        //  String fullString2 = fullString + " is this";
        //  System.out.println(fullString2);

        printLetters(fullString);

        
    }
    
}
