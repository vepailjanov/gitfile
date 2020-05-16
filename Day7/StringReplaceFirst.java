package Day7;

public class StringReplaceFirst {
    public static void main(String[] args) {
        String text = "Hello World Hello";
        System.out.println(text.replaceAll("[A-Z]", "h"));
        System.out.println(text.replaceAll("Hello", "hi"));
    }
}
