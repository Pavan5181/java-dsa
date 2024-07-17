public class oopstatic6 {

    public static void main(String[] args) {

        student s1 = new student();
        s1.schoolName = "jspm";

        student s2 = new student();
        System.out.println(s2.schoolName);

        student s3 = new student();
        s3.schoolName = "Abc";
        
    }
}
class student {
    String name;
    int roll;

    static String schoolName;

    void setName(String schoolName){
        this.name = name;
    }
    String getName() {
        return this.name;
    }

}
