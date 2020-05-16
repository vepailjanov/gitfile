package homePractice;

import java.util.HashMap;
import java.util.Set;

public class task6 {
    public static void main(String[] args) {
        colors();
    }
    public static HashMap<Integer,String> colors(){
        String[] array = {"red", "yellow", "green", "black"};
        HashMap<Integer,String> result = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int position = i + 1;
            String color = array[i];
            result.put(position,color);
        }
        System.out.println(result);
        return result;
    }
}
