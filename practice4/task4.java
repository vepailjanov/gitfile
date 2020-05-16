package practice4;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totallength = 0;
        while (scan.hasNext()){
            String str = scan.nextLine();
            System.out.println("My String is " + str);
            int lenght = str.length();
            totallength+=str.length();
            System.out.println("total lenght is " + totallength);
            if (totallength>50){
                break;
            }

        }
    }

}
