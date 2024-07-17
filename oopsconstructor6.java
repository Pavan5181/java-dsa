// public class oopsconstructor6 {
    
//     public static void main(String args[]){
//         Student s1 = new Student("pavan");
//         System.out.println(s1.name); 

//     }
    
// }
// class Student{
//     String name;
//     int age;

//         Student(String name){  // parameterized constructor
//             this.name = name;

//         }
// }

public class oopsconstructor6 {
    
    public static void main(String args[]){
        Student s1 = new Student();
        // System.out.println(s1.name); 

    }
    
}
class Student{
    String name;
    int age;

        Student(){        //non-parameterized constructor
            System.out.println("Constructor is called.....");

        }
}
