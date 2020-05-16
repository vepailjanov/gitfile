package day21;

import java.util.ArrayList;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
    ArrayList<Integer> mylist = nums();
        System.out.println(mylist);
        removal(mylist);
        System.out.println(mylist);

// create a method that will generate arrayList of integers with random numbers
    }
    public static ArrayList<Integer> nums (){
        ArrayList<Integer> nums = new ArrayList<>();
        Random rndm = new Random();
        nums.add(rndm.nextInt(20));
        nums.add(rndm.nextInt(40));
        nums.add(rndm.nextInt(59));
        return nums;
    }
    public static void removal(ArrayList<Integer> nums){
        nums.remove(0);
//        System.out.println(nums);
    }

}
