package day16;

import java.util.Random;
import java.util.Scanner;

public class JavaEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("provide name : ");
        String str1 = "Ayna";
        String str2 = "Maral";
        String str3 = "Suray";
        Random rndm = new Random();
        int i = rndm.nextInt(4);
        switch (i){
            case 1:
                System.out.println(i + " Ayna");
                break;
            case 2:
                System.out.println(i + " Maral");
                break;
            case 3:
                System.out.println(i + " Suray");
                break;
            default:
                System.out.println(" No one won!");
        }
    }

}
