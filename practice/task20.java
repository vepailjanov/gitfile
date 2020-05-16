package practice;

import java.util.Random;

public class task20 {
    public static void main(String[] args) {
        System.out.println("Your number please");
        Random r = new Random();
        double d = Math.random();
        int i = (int) (d * 10);
        System.out.println(i);
        int i1 = 6;
        int i2 = 7;
        int i3 = 8;
        int i4 = 9;
        int i5 = 10;
        if (i==i1||i==i2||i==i3||i==i4||i==i5){
            System.out.println("you won the game");
        }else{
            System.out.println("Game over");
        }
    }
}
