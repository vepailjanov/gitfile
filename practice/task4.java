package practice;

import java.util.Scanner;

public class task4 {
    // Write a Java program that reads a number
    // and display the square and cube
    public static void main(String[] args) {
        int i1 = 5;
        int square = (i1*i1);
        int cube = (i1*i1*i1);
        System.out.println(square);
        System.out.println(cube);
        Scanner s1 = new Scanner(System.in);
        int s2 = s1.nextInt();
        int square1 = s2 * s2;
        int cube1 = square1 * s2;
        System.out.println(square1);
        System.out.println(cube1);

    }
}
