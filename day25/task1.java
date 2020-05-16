package day25;

import java.util.HashMap;

public class task1 {
    public static void main(String[] args) {
        // Write a Java program to associate
        // the specified value with the specified key in a HashMap.
        HashMap<String, Integer> map = new HashMap<>();
        map.put("8th Grade", 21);
        map.put("9th Grade", 17);
        map.put("10th Grade", 19);
        printAll(map);
       printSize(map);
    }
    public static void printAll(HashMap<String, Integer> map) {
        System.out.println("my map " + map);
    }
    public static void printSize(HashMap<String, Integer> map){
        System.out.println(map.size());
    }
    public static void removeKey (HashMap<String, Integer> map){
        map.clear();
        System.out.println(map);
    }
}
