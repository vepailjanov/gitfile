package Day7;

public class StringEndWith {
    public static void main(String[] args) {
        String text = "Hello World";
        System.out.println("is the text starts with " + text.endsWith("Hello") );
        System.out.println("is the text starts with " + text.endsWith("hello") );
        System.out.println("is the text starts with " + text.endsWith("World"));
    }
}
