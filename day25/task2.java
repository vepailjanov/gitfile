package day25;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class task2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Bibi", 49);
        map1.put("Juma", 47);
        map1.put("Akgy", 45);
        map1.put("Azat", 43);
        System.out.println(map1);

        HashMap<String, Integer> map2 = new HashMap<>(map1);
        System.out.println("to get all the keys&values from map 1 : " + map2);

        Integer getAge = map1.get("Azat");
        System.out.println(getAge);

        boolean hasJuma = map1.containsKey("Juma");
        System.out.println(hasJuma);

        Set allKeySet = map1.keySet();
        System.out.println(allKeySet);

        System.out.println(map1.values());

        for (Map.Entry<String, Integer> row : map1.entrySet()) {
            String key = row.getKey();
            Integer value = row.getValue();
            System.out.println(key+value);
        }
    }
}
