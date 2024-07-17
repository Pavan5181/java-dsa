public class oopsabstract6 {
    public static void main(String[] args) {
        Mustang MyHorse = new Mustang();

        // Horse H = new Horse();
        // H.eat();
        // H.walk();
        // System.out.println(H.color);

        // Chicken C = new Chicken();
        // C.eat();
        // C.walk();
        
    }
    
}

abstract class Animal {
    String color;
    Animal(){
        System.out.println("Animal is called");
    }
    void eat(){
        System.out.println("Animal are eat");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
        color = "orange";
    }

    void walk(){
        System.out.println("Horse are walk on 4 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor is called");
    }
}

class Chicken extends Animal {
    void walk(){
        System.out.println("Chicken walk on 2 legs");
    }
}
