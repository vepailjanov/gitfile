package practice;

import java.util.Scanner;

public class task24 {
    public static void main(String[] args) {
        String s = "16/2020";
        String s1 = s.substring(0,2);
        int i = Integer.valueOf(s1);
        if (i>=1&&i<=12){
            System.out.println("correct");
        }else{
            System.out.println("wrong");
        }
    }
}
