package homePractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class task7 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);
        hashMap.put("four", 4);
        hashMap.put("five", 5);
        System.out.println(hashMap);
        TreeMap<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(hashMap);
        System.out.println(hashMap);


    }
}
