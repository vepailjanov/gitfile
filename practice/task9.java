package practice;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        String str1 = s1.nextLine();
        String str2 = s1.nextLine();
        str1 = str1.replace("$", "");
        str2 = str2.replace("$","");
        double d1 = Double.parseDouble(str1);
        double d2 = Double.parseDouble(str2);
        double result = d1 + d2;
        System.out.println(result);

    }
}
