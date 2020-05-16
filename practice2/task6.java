package practice2;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("write userpin");
        int userpin = s.nextInt();
        int pin = 5555;
        do {
            System.out.println("incorrect try again");
            userpin = s.nextInt();
        }while(userpin!=pin);
            System.out.println("matched");


    }

}
