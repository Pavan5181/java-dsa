public class function3{
    public static int multiply(int a , int b){
        int product = a*b;
        return product;
    }
public static void main(String args[] ){
    int a = 3;
    int b = 4;
    int pro = multiply(a,b);
    System.out.println(" a * b =" +pro);
    pro = multiply(10,20);
    System.out.println(" a * b =" +pro);
}

}