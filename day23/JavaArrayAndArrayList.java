package day23;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class JavaArrayAndArrayList {
    public static void oneDimensional() {
        // array
        int[] array1 = new int[5];
        int[] array2 = {4, 2, 9, 5};

        //ArrayList
        ArrayList<Integer> list1 = new ArrayList<>();
        // 1. way of creating ArrayList
//        ArrayList<Integer> list2 = (ArrayList<Integer>) Arrays.asList(4, 2, 9, 5);
        // 2. way of creating ArrayList
        List<Integer> list3 = Arrays.asList(4, 2, 9, 5);
    }
}
