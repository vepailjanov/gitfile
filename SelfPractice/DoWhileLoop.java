package SelfPractice;

import java.util.Random;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int UserPin = scan.nextInt();
        int pin = 5555;
        do {
            System.out.println("wrong pin try again");
            UserPin=scan.nextInt();
        }while(UserPin!=pin);{
            System.out.println("success");
        }
    }

}
