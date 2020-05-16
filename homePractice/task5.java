package homePractice;

import java.util.HashMap;

public class task5 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Vepa", 32);
        map.put("Mukam", 27);
        map.put("Shamy", 28);
        System.out.println(map);
         // 1st way
        HashMap<String, Integer> copy1 = new HashMap<>();
        copy1.putAll(map);
        System.out.println(map);
        copy2(map);
        removing(map);
        getting(map);
    }
    public static HashMap<String, Integer> copy2(HashMap<String, Integer> map){
        HashMap<String, Integer> copy = new HashMap<>(map);
        System.out.println(map);
        return map;
    }
    public static HashMap<String, Integer> getting (HashMap<String, Integer> map){
        HashMap<String, Integer> got =  new HashMap<>(map.get("Shamy"));
        System.out.println(map);
        return got;
    }
    public static HashMap<String, Integer> removing (HashMap<String, Integer> map){
        HashMap<String, Integer> removed =  new HashMap<>(map.remove("Vepa"));
        System.out.println(map);
        return removed;
    }


}
