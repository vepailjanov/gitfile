package day8;

import com.sun.tools.javac.code.Attribute;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        double square = number * number;
        double cube = number * number * number;
        System.out.println(number + square);
        System.out.println(number + cube);
    }
}
