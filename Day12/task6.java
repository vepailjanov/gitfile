package Day12;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
            /*
    Write a Java program to input marks of five subjects
    Physics, Chemistry, Biology, Mathematics and Computer,
    calculate percentage and grade according to given conditions:

If percentage >= 90% : Grade A
If percentage >= 80% : Grade B
If percentage >= 70% : Grade C
If percentage >= 60% : Grade D
If percentage >= 40% : Grade E
If percentage < 40% : Grade F
     */

        //ex:
//    Physics: 90,
//    Chemistry: 50,
//    Biology: 77,
//    Mathematics: 95
//    Computer: 65

        //percentage = (90+50+77+95+65)/5
        Scanner s = new Scanner(System.in);
        double Physics = s.nextDouble();
        double Chemistry = s.nextDouble();
        double Biology = s.nextDouble();
        double Mathematics = s.nextDouble();
        double Computer = s.nextDouble();
        double percentage = (Physics + Chemistry + Biology + Mathematics + Computer) / 5;

        if (percentage >= 90) {
            System.out.println("A");
        } else if (percentage >= 80)
            System.out.println("B");
        else if (percentage>=70){
            System.out.println("C");
        }else if (percentage >= 60){
            System.out.println("D");

        }else if (percentage >= 40){
            System.out.println("E");
        }else if (percentage < 40){
            System.out.println("F");
        }
    }

}
