package day20;

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        String str1 = "jack";
        String str2 = "john";
        String str3 = "jane";
        names(str1, str2, str3);
//        System.out.println(str1+" "+str2+" "+str3);
    }
    public static void names(String... names){
        System.out.println(Arrays.toString(names));

    }
}
