package day21;

import javax.print.event.PrintEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class task7 {
    public static void main(String[] args) {
        Random random = new Random(5);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        System.out.println(list);
        int max = Collections.max(list);
        System.out.println(max);
        int min = Collections.min(list);
        System.out.println(min);
        reverse(list);
        change(list);
        list.remove(2);
        System.out.println(list);
    }
    public static void reverse(ArrayList<Integer> list){
         Collections.reverse(list);
        System.out.println(list);
    }
    public static void change(ArrayList<Integer> list){
        list.set(2,120);
        System.out.println(list);
    }
}
