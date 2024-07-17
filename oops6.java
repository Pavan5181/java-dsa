public class oops6 {
public static void main(String args[]){
    pen p1 = new pen();
    p1.setcolor("Blue"); 
    System.out.println(p1.color); 
    p1.settip(5);
    System.out.println(p1.tip);
    p1.color = "yellow";
    System.out.println(p1.color); 
    BankAccount myacc = new BankAccount();
    myacc.username = "pavankarale";
    myacc.setpassword("abcde");
}
}

class pen {
    String color;
    int tip;

    void setcolor( String newColor){
        color = newColor;
    }
    void settip(int newTip){
        tip = newTip;
    }
}
    class BankAccount {
       public String username; 
       private String password;
       public void setpassword(String pwd){
           password = pwd;  

       }

    }
    class student {
        String name;
        int age;
        int percentage;

        void calpercentage(int che,int phy,int math){
            percentage = (phy+che+math)/3;
        }
    }
   



    
   
    
