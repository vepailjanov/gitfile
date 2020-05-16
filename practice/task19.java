package practice;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class task19 {
    //Task 6
    //Get 5 numbers from the user and determine if they are even or odd.
    //Sum the numbers that are even and and print them.
    public static void main(String[] args) {
        System.out.println("your number?");
        Scanner s = new Scanner(System.in);
        int i1 = s.nextInt();
        int i2 = s.nextInt();
        int i3 = s.nextInt();
        int i4 = s.nextInt();
        int i5 = s.nextInt();
        int sum = i1 + i2 + i3 + i4 + i5;
        if (sum % 2 == 0) {
            System.out.println(sum);
        }
    }
}
