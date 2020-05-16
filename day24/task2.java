package day24;

import java.util.HashSet;
import java.util.Arrays;


public class task2 {
    public static void main(String[] args) {
        HashSet<String> names1 = new HashSet<>(Arrays.asList("John", "jake", "hanna", "max"));
        HashSet<String> names2 = new HashSet<>(Arrays.asList("John", "jake", "susan", "hanna", "max"));
        union(names1, names2);
        intersection(names1,names2);
    }

    public static HashSet<String> union(HashSet<String> team1, HashSet<String> team2) {
        HashSet<String> total = new HashSet<>();
        total.addAll(team1);
        total.addAll(team2);
        System.out.println(total);
        System.out.println(total.size());
        return total;
    }

    public static HashSet<String> intersection(HashSet<String> team1, HashSet<String> team2) {
        HashSet<String> intersection = new HashSet<>(team1);
        intersection.retainAll(team2);
        System.out.println(intersection);
        return intersection;
    }
}
