package day13;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int pincode = 5555;
        do{
            System.out.println("wrong");
            pincode++;
        }while(i==pincode);
            System.out.println("right");
        }
    }

