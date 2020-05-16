package Array;

import java.util.Arrays;

public class task15 {
    public static void main(String[] args) {
        namesAndnums("aman",23,5,6,34);
    }
    public static void namesAndnums(String str, int... nums){
        System.out.println(Arrays.toString(nums));
    }
}
