package day31.task1;
        /*create class Student
        with private 2 fields: name, age
        also, create private default constructor
        and public constructor that initialize all attributes
        create objects of Student class in Task2.java
        */

public class Student {
    private String name;
    private int age;


    private Student(){

    }
    public Student(String name, int age){
        this.name = name;
        this.age = age;

    }
    public void updateName(String name) {

        if(name.startsWith("M")) {
            System.out.println("No name with M latter");
        } else {
            this.name = name;
        }
    }
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

