package practice;

import java.util.Random;
import java.util.Scanner;

public class task21 {
    public static void main(String[] args) {
        System.out.println("your number please?");
        Scanner s = new Scanner(System.in);
        int i1 = s.nextInt();
        Random r = new Random();
        int i2 = r.nextInt(3);
        if (i1==i2){
            System.out.println("You won the game : " + i2);
        }else{
            System.out.println("Game over : " + i2);
        }

    }
}
