package day21;

import java.util.ArrayList;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        // create a method that will generate arrayList of double with random double values
//        System.out.println(nums());
//        nums();
        ArrayList<Double> doubles= nums();
        Double secondMethod = retrive(doubles,0);
        Double thirdMethod = update(doubles,2);
        System.out.println(doubles);
        System.out.println(secondMethod);
        System.out.println(thirdMethod);
    }
    public static ArrayList<Double> nums (){
        ArrayList<Double> nums = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            nums.add(Math.random()*100);
        }
        return nums;
    }
    public static Double retrive (ArrayList<Double> nums, int i){
        return nums.get(i);
    }
    public static Double update (ArrayList<Double> nums, int i1) {
        return nums.set(2, 3.0);
    }


}
