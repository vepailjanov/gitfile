package day23;

import java.util.ArrayList;
import java.util.HashSet;

public class task2 {
    public static void main(String[] args) {
    }
    public static void var(HashSet<Integer> n1, Integer...nums){
        for (int number : nums) {
            n1.add(number);
        }
    }
    public static ArrayList<Integer> var1(HashSet<Integer> i1){
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer number : i1) {
            result.add(number);
        }
        return result;
    }
}
