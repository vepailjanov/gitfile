package Array;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        char[] charArr = {'a', 'y', 'k','a'};
        System.out.println(Arrays.toString(charArr));
        for (int i =3; i>=0;i--){
            System.out.print(charArr[i]);
        }
        System.out.println();
        for (int i = 0; i < charArr.length; i++) {
            System.out.println(charArr[i]);
        }
    }
}
