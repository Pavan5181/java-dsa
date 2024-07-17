public class patteren4{
    public static void main(String args[]){
        int n = 4;
        char ch = 'A';
        for(int line=1; line<=n; line++) { // this is for outer loop
            for(int chars=1; chars<=line; chars++) { // this is for inner loop
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}