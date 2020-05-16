package day24;

import java.util.HashSet;

public class JavaSetMethods {

    // Set: union
    // all elements in both sets
    // A.addAll(B)
    public static HashSet<Integer> union(HashSet<Integer> setA, HashSet<Integer> setB) {
        HashSet<Integer> union = new HashSet<>();
        union.addAll(setA);
        union.addAll(setB);
        System.out.println(union);
        return union;

    }

    // Set: intersection
    // common elements in both sets
    // A.retainAll(B)    // To find intersection
//        setA.retainAll(setB);
    public static HashSet<Integer> intersection(HashSet<Integer> setA, HashSet<Integer> setB) {
        HashSet<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);
        System.out.println(intersection);
        return intersection;
    }


    public static void main(String[] args) {
        HashSet<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);

        HashSet<Integer> setB = new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);
        System.out.println("union ");
        union(setA,setB);
        System.out.println("intersection ");
        intersection(setA,setB);
    }

}

