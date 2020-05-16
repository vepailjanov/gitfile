package day19;

public class task4 {
    // create a method which checks if length of string is at least 8 characters
    // create a method which checks if character is letter
    // create a method which counts letters in given string
    // create a method which checks if character is digit
    // create a method which counts digits in given string
    //    Write a Java method to check whether a string is a valid password.
    //    Password rules:
    //    A password must have at least ten characters.
    //    A password consists of only letters and digits.
    //    A password must contain at least two digits.

    public static void main(String[] args) {
        String text = "helloeveryone";
        strlength(text);
        letter(text);
        count(text);
    }
    public static void strlength (String text){
        if (text.length()>=8){
            System.out.println(true);
        }else{
            System.out.println("false");
        }
    }
    public static void letter (String text){

        }
    public static void count (String text){
       int count = 0;
       count=text.length();
        System.out.println(count);
    }
    public static void password (String text){
     if (text.length()>=10){

     }
    }
}
