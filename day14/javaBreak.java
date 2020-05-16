package day14;

public class javaBreak {
    public static void main(String[] args) {
        String str = "Stay home";
        for (int i = 0; i <str.length(); i++){
            char letter = str.charAt(i);
            if (letter == ' '){
                break;
            }
            System.out.println(letter);
        }
    }
}
