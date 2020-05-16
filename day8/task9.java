package day8;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        double celsius, fahrenheit;
        Scanner s = new Scanner(System.in);
        System.out.println("fahrenheit");
        fahrenheit = s.nextDouble();
        celsius = (fahrenheit-32)*(0.5556);
        System.out.println("tempreture in celsius" + celsius);

    }
}
