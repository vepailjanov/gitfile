package day33.JavaRecursion;

import java.util.Arrays;

public class getmax {
    public static void main(String[] args) {

        int[] numbers = new int[args.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
            System.out.println(numbers[i]);
        }
        Arrays.sort(numbers);
        int result = numbers[numbers.length-1];
        System.out.println("Max is : " + result);
    }
}

