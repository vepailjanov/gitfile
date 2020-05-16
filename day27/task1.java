package day27;

public class task1 {
        // create class student with fields:
        // string name, double grade
        public static void main(String[] args) {
            stdnts("jack",23.4);
            stdnts("oleg",34.6);
            stdnts("mac",18.9);

        }
        public static void stdnts(String student, Double nums){
            Student student1 = new Student();
            student1.name=student;
            student1.grade=nums;
            System.out.println(student+" "+nums);
        }
}
class Student{
    String name;
    double grade;
}

