package day6;

public class StringSubstring {
    public static void main(String[] args) {
        String text = "Hello World";
//        String m1 = text.substring(0, 1);
//        String m2 = text.substring(6,7);
        System.out.println("Hello World".substring(0,1) + "." + "Hello World".substring(6,7));
        String j1 = "Fuck Off";
        String j2 = j1.substring(0,1);
        String j3 = j1.substring(5, 6);
        System.out.println(j2 + "." + j3);
        String a1 = "makhow";
        System.out.println(a1.substring(3,5));


    }
}
