package Day9;

import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1  = scan.nextLine();
        System.out.println(s1);
        String s2 = scan.nextLine();
        System.out.println(s2);
        s1 = s1.replace("$", "");
        s2 = s2.replace("$", "");
        double total = Double.parseDouble("$12");
        System.out.println(s1 + s2);

    }
}
