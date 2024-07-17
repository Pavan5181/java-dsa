public class oopsinheritance6 {
    public static void main(String[] args) {
    //      fish shark = new fish();
    //      shark.eat();
    // }
            dog dobby = new dog();
            dobby.eat();
            dobby.legs = 4;
            System.out.println(dobby.legs);
            
    }     
    
}

class Animal{
    String color;

    void eat(){
        System.out.println("animal are eats");

    }
    void braeths() {
        System.out.println("Animal are breathes");
    }
}
 class mammel extends Animal{
    int legs;
 }
 class dog extends mammel{
    String breed;
 } 
 
 
 
 // //derived class = subclass
 // class fish extends Animal {
    //     int fins;
    
    //     void swims(){
        //         System.out.println("fish are swims");
        //     }
        //}