package practice2;

import java.util.Random;
import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int providedNum = scan.nextInt();
        Random rndm = new Random();
        int randomNum = rndm.nextInt(3);
        if (providedNum==randomNum){
            System.out.println(randomNum + " You win the game");
        }
        else {
            System.out.println(randomNum + " Game over");
        }
    }
}
