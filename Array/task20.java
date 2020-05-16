package Array;

import java.util.Arrays;
import java.util.Random;

public class task20 {
    public static void main(String[] args) {
        int[] numbers = new int [50];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(11);
        }
        System.out.println(Arrays.toString(numbers));
        for (int num : numbers) {
            if(num==1){
                System.out.println(num + " It has one");
            }
        }
    }
}
