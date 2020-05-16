package Array;

import java.util.Arrays;

public class ArrayString {
    public static void main(String[] args) {
        String[] strarr = {"hello", "hi", "hilo", "jake"};
        for (int i = 0; i < strarr.length; i++){
            System.out.println(strarr[i]);
        }
        System.out.println(Arrays.toString(strarr));

    }
}
