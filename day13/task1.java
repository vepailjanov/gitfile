package day13;

import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int int1 = random.nextInt(10);
        int result = 0;
        int i = 1;
        System.out.println(int1);
        while (i <= int1) {
            result += i;
            System.out.println(i);
        ++i;
        }
        System.out.println(result);
    }
}
