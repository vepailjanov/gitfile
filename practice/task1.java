package practice;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        // Task1: Write a Java program that multiplies four integers
        // and print the result
        // version 1
        int i1 = 1;
        int i2 = 2;
        int i3 = 3;
        int i4 = 4;
        // or int i1 = 1, i2 = 2, i3 = 3, i4 = 4;
        System.out.println((i1*i2*i3*i4));
        // version 2
        System.out.println((1*2*3*4));
        // part 2:  Use Scanner to provide numbers
        Scanner s1 = new Scanner(System.in);
        int int1 = s1.nextInt();
        int int2 = s1.nextInt();
        int int3 = s1.nextInt();
        int int4 = s1.nextInt();
        System.out.println((1*2*3*4));
    }

}
