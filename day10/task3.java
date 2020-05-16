package day10;

import java.util.Scanner;

public class task3 {
    /*
        Task 3

        create two ints

        Find the reminder from first to second one

        if First one should be bigger then second one

        if the reminder is 4
                print num 1 divide by num 2 is 4

        else if the reminder is 3
                print num 1 divide by num 2 is 3

        else if the reminder is 2
                print num 1 divide by num 2 is 2

         else if the reminder is 1
                print num 1 divide by num 2 is 1

        else if the reminder is 0
                print num 1 divide by num 2 is 0

         */
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        int i1 = myscan.nextInt();
        int i2 = myscan.nextInt();
        int total = (i1%i2);
        if (i2>i1){
            System.out.println("first");

        }else if (total == 4){
            System.out.println("second");

        }else if (total == 3){
            System.out.println("third");

        }else if (total == 2){
            System.out.println("fourth");
        }else if (total == 1){
            System.out.println("fifth");

        }else if (total == 0){
            System.out.println("sixth");
        }
    }
}
