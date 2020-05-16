package practice4;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        while (scan.hasNext()){
            total+=scan.nextInt();
            System.out.println("total is " + total);
            if (total>100){
                break;
            }

        }
    }
}
