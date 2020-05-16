package practice;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int i1 = s1.nextInt();
        if (i1<0) {
            System.out.println(i1 * (-1));

        }else{
            System.out.println(i1);
        }
    }
}
