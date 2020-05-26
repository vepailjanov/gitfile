package ArrayListPractice;

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

    }
    static class Student {
        private String studentName;
        private int studentAge;

        public String getStudentName() {
            return studentName;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public int getStudentAge() {
            return studentAge;
        }

        public void setStudentAge(int studentAge) {
            this.studentAge = studentAge;
        }

        public String toString() {
            return "Student{" +
                    "studentName='" + studentName + '\'' +
                    ", studentAge=" + studentAge +
                    '}';
        }
    }
}
