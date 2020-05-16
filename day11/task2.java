package day11;

import java.util.Random;
import java.util.Scanner;

public class task2 {
    // Let user provide a number between 0 and 3
    // and generate a random number between 0 and 3
    // and check if provided number is equal to generated number
    // if they are equal print out "You Won the Game!!!"
    // else "Game Over!!!"
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int i2 = s1.nextInt();
        Random r1 = new Random();
        int i1 = r1.nextInt(4);
        if (i2 == i1){
            System.out.println("You Won the Game");
        }else {
            System.out.println("Game over");
            System.out.println(i1);
        }

    }
}
