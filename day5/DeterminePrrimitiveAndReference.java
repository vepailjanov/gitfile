package day5;

import java.util.Scanner;

public class DeterminePrrimitiveAndReference {
    public static void main(String[] args) {
        Scanner MyScan = new Scanner(System.in);
        System.out.println("What's your username?");
        String username = MyScan.nextLine();
        System.out.println("Your username is " + username);
        System.out.println("What's your password?");
        int password = MyScan.nextInt();
        System.out.println("Your password is " + password);
    }
}
