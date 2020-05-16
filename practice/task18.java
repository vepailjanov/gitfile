package practice;

import java.util.Scanner;

public class task18 {
    public static void main(String[] args) {
        //Task 4
        //Tell the student his/her letter grade by asking them their number grade.
        //90 and above A
        //80 and above B
        //70 and above C
        //60 and above D
        //below 60 F
        Scanner s = new Scanner(System.in);
        System.out.println("your grade please?");
        int grade = s.nextInt();
         if (grade>90) System.out.println("A");
        else if (grade>80 && grade<90) System.out.println("B");
        else if (grade>70 && grade<80) System.out.println("A");
        else if (grade>60 && grade<70) System.out.println("A");
        else if (grade<50 && grade < 60) System.out.println("A");
    }
}
