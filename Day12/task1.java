package Day12;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int i1 = s1.nextInt();

        if (i1 >= 90) System.out.println("A");
        else if (i1 < 90 && i1 >= 70) System.out.println("B");
        else if (i1 < 70 && i1 >= 50) System.out.println("C");
        else if (i1 < 50) System.out.println("D");
    }

}
