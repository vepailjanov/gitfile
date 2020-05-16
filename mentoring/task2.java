package mentoring;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int i1 =1;
        int sum = 1;
        do {
            sum *=i1;
            i1++;
        }while (i1<=i);
        System.out.println(sum);
    }
}
