package Day7;

public class StringStartWith {
    public static void main(String[] args) {
        /*
        startWith checks whether a string starts with specific
        character
        returns boolean

         */
        String text = "Hello World";
        System.out.println("is the text starts with " + text.startsWith("Hello") );
        System.out.println("is the text starts with " + text.startsWith("hello") );
        System.out.println("is the text starts with " + text.endsWith("World"));

    }
}
