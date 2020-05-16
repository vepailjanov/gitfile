package practice;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        int i1 = 5, i2 = 3, i3 = 2;
        System.out.println((i1+i2+i3) / 3.0);
        int a =10;
        int result = a + ++a + a++ + --a - a--;
        System.out.println(result);
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a++);
        System.out.println(a++);
        System.out.println(a++);
        System.out.println(a++);
        Scanner s1 = new Scanner(System.in);
        int int1 = s1.nextInt();
        int int2 = s1.nextInt();
        int int3 = s1.nextInt();
        System.out.println((int1+int2+int3) / 3.0);
    }


}
