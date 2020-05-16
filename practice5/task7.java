package practice5;

import java.util.ArrayList;
import java.util.HashSet;

public class task7 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("menli");
        names.add("nury");
        names.add("chynar");
        names.add("atash");
        names.add("menli");
        names.add("menli");
        names.add("menli");
        System.out.println(names);
        createSet();
    }
    public static void createSet(){
        HashSet<String> set1 = new HashSet<>();
        set1.add("menli");
        set1.add("nury");
        set1.add("chynar");
        set1.add("atash");
        set1.add("menli");
        set1.add("menli");
        set1.add("menli");
        System.out.println(set1);

    }
}
