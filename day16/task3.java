package day16;

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        String [] arr = new String [5];
        arr[0]="hello";
        arr[1]="hi";
        arr[2]="why";
        arr[3]="ok";
        arr[4]="maybe";
        arr[1]=arr[1].toUpperCase();
        for (String array : arr) {
            System.out.println(array);
        }
        int [] i1 = {1,4,32,65,32,11,};
//        for (int int1 : i1) {
//            System.out.println(int1);
//        }
        System.out.println(Arrays.toString(i1));
    }
}
