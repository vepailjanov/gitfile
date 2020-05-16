package day8;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        int a = 5, b = 3, c = 2;
        System.out.println((a+b+c) / 3);
        Scanner MyScan = new Scanner(System.in);
        int d = MyScan.nextInt();
        System.out.println(d);
        int e = MyScan.nextInt();
        System.out.println(e);
        int f = MyScan.nextInt();
        System.out.println(f);
        int total = d + e + f;
        System.out.println(total % 3);
    }
}
