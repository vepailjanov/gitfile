package homePractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class task3 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(1, 33, 3, 4, 6, 22, 7, 8, 15,6));
        System.out.println(hashSet);
        TreeSet<Integer> treeset = new TreeSet<>(hashSet);
        System.out.println(treeset);
        LinkedHashSet<Integer> linkedhashset = new LinkedHashSet<>(Arrays.asList(1, 33, 3, 4, 6, 22, 7, 8, 15,6));
        System.out.println(linkedhashset);
    }
}
