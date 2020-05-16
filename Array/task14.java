package Array;

import java.util.Arrays;

public class task14 {
    public static void main(String[] args) {
    vararg("aman");
    vararg("aman", "jemal");
    vararg("aman", "jemal", "maya");
    vararg("aman", "jemal", "maya", "selbi");
    }
    public static void vararg (String... names){
//        System.out.print(names.length);
        System.out.println(Arrays.toString(names));
    }
}
