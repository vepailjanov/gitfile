package practice5;

import java.util.HashSet;

public class task8 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        boolean add1 = set.add(1);
        boolean add2 = set.add(2);
        boolean add3 =set.add(3);
        boolean add4 =set.add(1);
        System.out.println(set);
        System.out.println(add1);
        System.out.println(add2);
        System.out.println(add3);
        System.out.println(add4);
    }
}
