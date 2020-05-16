package day19;
import java.util.Arrays;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int[]number={2,7,8,45,78,3};
        printMax(number);
    }
    public static void printMax(int[]array){
        Arrays.sort(array);
        int lastindex = array.length -1;
        System.out.println(array[lastindex]); // prints max
        System.out.println(array[0]); // prints min
    }
}
