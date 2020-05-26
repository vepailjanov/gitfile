package homework;

import java.util.Random;
import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        varargs("jelil", 3,6,5,43,76,2,34);
    }
    public static void varargs(String name,int... points){
    int sum =0;
    int avg = 0;
        for (int i = 0; i < points.length; i++) {
            sum+=i;
        }
        avg=sum/points.length;
        System.out.println("sum is :"+sum);
        System.out.println("avg is :"+avg);
    }
}
