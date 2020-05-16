package practice3;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str= scan.nextLine();
        for (int i=0; i<str.length(); i++){
            char letter = str.charAt(i);
            if (letter==' '||letter=='a'){
                continue;
            }
            System.out.println(letter);
        }
    }
}
