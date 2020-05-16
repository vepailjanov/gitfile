package homePractice;

import java.util.HashSet;

public class task1 {
    public static HashSet<Integer> union(HashSet<Integer> setA, HashSet<Integer> setB){
        HashSet<Integer> union = new HashSet<>();
        union.addAll(setA);
        union.addAll(setB);
        System.out.println(union);
        return union;
    }
    public  static HashSet<Integer> intersection (HashSet<Integer> setA, HashSet<Integer> setB){
      HashSet<Integer> intersection = new HashSet<>(setA);
      intersection.retainAll(setB);
        System.out.println(intersection);
      return intersection;
    }
    public static HashSet<Integer> difference (HashSet<Integer> setA, HashSet<Integer> setB){
        HashSet<Integer> difference = new HashSet<>(setA);
        difference.removeAll(setB);
        System.out.println(difference);
        return difference;
    }
    public static void main(String[] args) {
        HashSet<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);
        System.out.println(setA);
        HashSet<Integer> setB = new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);
        setB.add(8);
        System.out.println(setB);
        union(setA,setB);
        intersection(setA,setB);
        difference(setA,setB);
    }
}
