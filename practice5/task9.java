package practice5;

import java.util.Arrays;
import java.util.HashSet;

public class task9 {
    public static void main(String[] args) {
        HashSet<Integer> intiger = hash();
        addelement(intiger, 100,300,23);
        addelement(intiger, 14,54,23);
    }
    public static HashSet<Integer> hash() {
        HashSet<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(5);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        System.out.println(nums);
        int[] array = {1,2,3,4,5,5,5,6,7,8};
            for (int numbers : array) {
            nums.add(numbers);

            }
        System.out.println(nums);
            return nums;
        }
        public static void addelement (HashSet<Integer> nums, Integer... values){
            for (int numbers : values) {
                nums.add(numbers);
            }
            System.out.println(nums);


        }
    public static void printline (HashSet<Integer> nums){
        for (Integer integer : nums) {
            System.out.println(integer);
        }
    }
    public static HashSet<Integer> Arraylist(HashSet<Integer> nums){
        HashSet<Integer> result = new HashSet<>();
        for (Integer numbers1 : nums) {
            result.add(numbers1);
        }
        System.out.println(result);
        return result;
    }
        
    }

