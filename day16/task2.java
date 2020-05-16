package day16;

import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rndm = new Random();
        int sum = 0; //  summing
        double avg = 0; // average
        for (int i =0; i <array.length;i++){
           int rendomNumber =rndm.nextInt(100);
            array[i] = rendomNumber;
            sum+=array[i]; // summing
            avg = sum/10.0;
            System.out.println(rendomNumber);
        }
        System.out.println(sum); //summing
        System.out.println(avg);
    }
}
