package day19;

public class task3 {
    public static void main(String[] args) {
        String name = "Eren";
        firsletter(name);
    }
        public static char firsletter(String text){
            System.out.println(text.charAt(0));
            System.out.println( text.replace('r','d'));
            return text.charAt(0);
        }
    }
