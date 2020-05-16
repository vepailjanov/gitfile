package Day12;

import java.util.Random;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Random r = new Random();
        int i = r.nextInt(6);
        System.out.println(i);
//        String num = "";
        switch (i){
            case 0:
                System.out.println("null");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            default:
                System.out.println("wrong code");
        }


    }

}
