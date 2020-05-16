package day10;

import java.util.Scanner;

public class JavaIfClass2 {
    public static void main(String[] args) {
        Scanner myscan = new Scanner( System.in);
        String s1 = myscan.nextLine();
        String s2 = myscan.nextLine();
        int total = s1.length() + s2.length();
        if (total > 10){
            System.out.println("right");

        }else if (total >5){
            System.out.println("wrong");

        }else if (total > 3){
            System.out.println("maybe");

        }

    }
}
