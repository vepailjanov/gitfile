package JavaClass.task;

class Student {
    String name;
    int grade;
}

public class task1 {
    public static void main(String[] args) {
        Student student1 = studentMethod("Vepa", 5);
        printstudent(student1);
        Student student2 = studentMethod("Mukam", 4);
        printstudent(student2);
        Student student3 = studentMethod("Serdar",3);
        printstudent(student3);
    }
    public static Student studentMethod (String name, int grade){
        Student students  = new Student();
        students.name = name;
        students.grade = grade;
        return students;
    }
    public static void printstudent (Student student){
        System.out.println(student.name +" ==> "+ student.grade);
    }
}
