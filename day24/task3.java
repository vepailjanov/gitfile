package day24;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class task3 {
    public static void main(String[] args) {
        // HashSet
        // [1, 6, 33, 15, 22, 7, 8, 4, 3, 6]
        HashSet<Integer> hashSet = new HashSet();
        hashSet.add(1);
        hashSet.add(5);
        hashSet.add(33);
        hashSet.add(15);
        hashSet.add(22);
        hashSet.add(7);
        hashSet.add(8);
        hashSet.add(4);
        hashSet.add(3);
        hashSet.add(6);

        System.out.println("HashSet: " + hashSet);

        //TreeSet = sorted set
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(33);
        treeSet.add(15);
        treeSet.add(22);
        treeSet.add(7);
        treeSet.add(8);
        treeSet.add(4);
        treeSet.add(3);
        treeSet.add(6);

        System.out.println("TreeSet: " + treeSet);

        //LinkedHashSet = maintains insertion order// order of adding elements to set is maintained
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(5);
        linkedHashSet.add(33);
        linkedHashSet.add(15);
        linkedHashSet.add(22);
        linkedHashSet.add(7);
        linkedHashSet.add(8);
        linkedHashSet.add(4);
        linkedHashSet.add(3);
        linkedHashSet.add(6);

        System.out.println("LinkedHashSet: " + linkedHashSet);
    }
}
