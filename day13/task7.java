package day13;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("your number please");
        int i = s.nextInt();
        switch (i){
            case 1:
                System.out.println("hi");
                break;
            case 2:
                System.out.println("bye");
                break;
            default:
                System.out.println("wrong number ");
        }


    }

}
