package day6;

public class StringEquals {
    public static void main(String[] args) {
        String s1 = "hello";
        System.out.println(s1.equals("Hello"));
        System.out.println(s1.equalsIgnoreCase("Hello"));
        System.out.println(s1.equalsIgnoreCase("llo"));
        System.out.println(s1.equals("Hello"));
        System.out.println(s1.equals("hi"));
    }
}
