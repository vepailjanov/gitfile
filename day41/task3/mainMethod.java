package day41.task3;

import java.util.ArrayList;
import java.util.List;

public class mainMethod {
    public static void main(String[] args) throws Exception {
        School school1 = new School("2370 Boynton",54,"5513334214","John Wick","Good school",getStudents(),500);
        School school2 = new School("8023 83rd st",40,"454543554","Marry Patric","Bad school",getStudents(),600);
        for(Student student : getStudents()) {
            school1.GetStudent(student);
        }
        System.out.println(school1);
        System.out.println(school2);
    }

    public static List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Furkat", 534545));
        students.add(new Student("Serdar", 434343));
        students.add(new Student("Aysegul", 656454));
        return students;
    }
}
