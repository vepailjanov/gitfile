package day10;

import java.util.Scanner;

public class task2 {
    /*
            Create one int
            How many rooms you need

            if int more then 3 then
            print we dont have any apartments more then 3 rooms

            else if int is equal to 3
            Rent is 2500

            else if int is equal to 2
            Rent is 2000

            else if int is equal to 1
            Rent is 1500

            else if int is equal to 0
            Rent is 1300


         */
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        int num = myscan.nextInt();
        if (num >3){
            System.out.println("first");
        }else if (num == 3){
            System.out.println("second");

        }else if (num == 1){
            System.out.println("third");

        }else if (num == 0){
            System.out.println("fourth");

        }
        }
        }

