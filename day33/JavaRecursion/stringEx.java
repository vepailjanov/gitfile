package day33.JavaRecursion;

import java.util.Arrays;

public class stringEx {
    public static void main(String[] args) {
        int count = 0;
        for (String str1 : args) {
            if (str1.contains("h")){
                count++;
                str1=str1.replace("l","n");
            }
            System.out.println(str1.toUpperCase() + " " + str1.length());
        }
        System.out.println("It has " + count + " : H");
    }
}
