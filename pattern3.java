public class pattern3{
    public static void main(String args[]){
        int n = 7;
        for(int line=1; line<=n; line++) { // this is for outer loop
            for(int number=1; number<=line; number++) { // this is for inner loop
                System.out.print(number);
            }
            System.out.println();
        }

    }
}