package Day9;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        int num1 = myscan.nextInt();
        int num2 = myscan.nextInt();

        if (num1 > num2){
            System.out.println("1st");

        }

        if (num1< num2){
            System.out.println("2nd");
        }

    }
}
