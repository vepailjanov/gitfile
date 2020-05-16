package day17;

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        String[] str  = {"Ali, Jack, Jane"};
        String[] str1 = new String[str.length];
        for (int i = 0; i<str.length; i++){
            str1[i] = str[i];
        }
        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(str1));

    }
}
