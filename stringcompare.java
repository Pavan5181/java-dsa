public class stringcompare {
    public static void main(String[] args) {
        String s1 = "pavan";
        String s2 = "pavan";
        String s3 = new String("pavan");

        if(s1==s2){
            System.out.println("string is equal");
        }else{
            System.out.println("String is not equal");
        }
        if(s1==s3){
            System.out.println("string is equal");
        }else{
            System.out.println("String is not equal");
        }

        if(s1.equals(s3)){
            System.out.println("string is equal");
        }else{
            System.out.println("String is not equal");
        }
        

    }
}
