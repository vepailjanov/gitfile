package day31.task1;

public class Objects {
    public static void main(String[] args) {
        Student student1 = new Student("John", 20);
        // cannot change private field from different class
        // student1.name = "Max";
        System.out.println("Student1 before name update: " + student1);
        student1.updateName("Maral");
        System.out.println("Student1 after name update: " + student1);
        Student student2 = new Student("Mukam", 43);
        System.out.println(student2);
    }
}
