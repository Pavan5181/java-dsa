public class ifelse{
    public static void main(String args[]){
        int age = 17;
        if(age>=18){
            System.out.println("you allow to drive");
        }
        if(age>13 && age<18){
            System.out.println("teenager");
        }
        else{
            System.out.println("you are not eligible to drive");
        }
    }
}