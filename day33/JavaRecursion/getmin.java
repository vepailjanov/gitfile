package day33.JavaRecursion;

import java.util.Arrays;

public class getmin {
    public static void main(String[] args) {
        int [] minnum = new int [args.length];
        for (int i = 0; i < minnum.length; i++) {
            minnum[i]=Integer.parseInt(args[i]);
            System.out.println(minnum[i]);
        }
        System.out.println();
        Arrays.sort(minnum);
        int result = minnum[0];
        System.out.println(result);
    }
}
