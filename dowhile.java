public class dowhile{
    public static void main(String args[]) {
        // int counter = 1;

        // do {
        //     System.out.println("hello print");
        //     counter++;           
        // }while( counter <= 10);
    for (int i=1; i<=5; i++) {
        if(i == 5) {
            break;
        }
        System.out.println(i);
    }
    System.out.println("i am out of the loop");
    }
}