public class patteren2{
    public static void main(String args[]) {
        int n = 7;
        for(int line=1; line<=n; line++) { // this is for outer loop
            for(int star=1; star<=(n-line+1); star++) { // this is for inner loop
                System.out.print("*");
            }
            System.out.println();
        }

    }
}