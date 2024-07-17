public class patteren1{
    public static void main(String args[]){
        for(int line=1; line<=10; line++) { // this is for outer loop
            for(int star=1; star<=line; star++) { // this is for inner loop
                System.out.print("*");
            }
            System.out.println();
        }

    }
}