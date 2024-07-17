public class oopspoly6 {
    public static void main(String[] args) {
        deer D = new deer();
        D.eat();
        
    }

}

// this is the example of overriding
class Animal{
    void eat(){
        System.out.println("Eat anythings");
    }
}

class deer extends Animal{
    void eat(){
        System.out.println("Eat grass");
    }
}

    
