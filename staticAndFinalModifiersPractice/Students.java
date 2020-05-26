package staticAndFinalModifiersPractice;

import day41.task3.Student;

public class Students {
    static String firstname;
    String lastname;
    private final int age;

    public Students(String lastname, int age) {
        this.lastname = lastname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Students student1 = new Students("White",35);
        System.out.println(student1);
        Students.firstname = "Jack";

        Students.firstname = "Maya";

    }
}
