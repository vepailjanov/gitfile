package JavaClass;

class student{
    String name;
    int age;
}

public class JavaClassAndObject {
    public static void main(String[] args) {
        student student1 = new student();
        student1.name = "Vepa";
        student1.age = 31;
        System.out.println(student1.name);
        System.out.println(student1.age);
    }

}
