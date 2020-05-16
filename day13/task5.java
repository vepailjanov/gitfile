package day13;

import java.util.Scanner;

public class task5 {
    // pin ode
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your pincode");
        int userpin = s.nextInt();
        int pincode = 5555;

        while (userpin != pincode) {
            System.out.println("Incorrect pin");
            System.out.println("Try your pin again");
            userpin = s.nextInt();
        }
        System.out.println("Entered succesufully");

    }
}
