public class oopspolymorphisms6 {
    public static void main(String[] args) {
        calculator calc = new calculator();
        System.out.println(calc.sum(1, 6));
        System.out.println(calc.sum((float)1.6,(float)1.7));
        System.out.println(calc.sum(1, 6, 9));
    }
    
}
// this is example of method overloading
class calculator{
    int sum(int a,int b) {
        return a+b;

    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    
}
