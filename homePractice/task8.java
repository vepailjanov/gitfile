package homePractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class task8 {
    public static ArrayList<Integer> numbers(){
        ArrayList<Integer> result = new ArrayList<>();
        Random random = new Random();
        int count = 0;
        for (int i = 0; i < 100; i++) {
            result.add(random.nextInt(10));
        }
        System.out.println(result);
        return result;
    }
    public static HashMap<Integer, Integer> similar(ArrayList<Integer> numbers){
        HashMap<Integer, Integer> result = new HashMap<>();
        for (Integer number : numbers) {
            result.put(number,0);
        }
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        numbers();
        similar(numbers());
    }

}
