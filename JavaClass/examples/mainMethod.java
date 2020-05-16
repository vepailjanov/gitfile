package JavaClass.examples;

public class mainMethod {
    public static void main(String[] args) {
        student student1 = new student();
        student1.name = "Vepa";
        student1.age = 31;
        student1.courseinfo = new course();
        student1.courseinfo.address = "Yashlyk 30";
        student1.courseinfo.price = 250;
    }
}
