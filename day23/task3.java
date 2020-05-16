package day23;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        Random random = new Random();
        HashSet<Integer> integers = new HashSet<>();
        integers.add(random.nextInt(100));
        integers.add(random.nextInt(100));
        integers.add(random.nextInt(100));
        integers.add(random.nextInt(100));
        integers.add(random.nextInt(100));
        System.out.println(integers);
    }
}
