package practice2;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hackpin = s.nextInt();
        int pin = 5555;
        do {
            System.out.println("incorrect try again");
            hackpin = s.nextInt();
        }while(hackpin!=pin);
        System.out.println("matched");
    }
}
