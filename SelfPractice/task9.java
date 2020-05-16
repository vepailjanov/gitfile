package SelfPractice;

public class task9 {
    public static void main(String[] args) {
        String str1 = UpCase("why the fuck you're mad at me?!");
        System.out.println(str1.toUpperCase());
    }
    public static String UpCase(String str){
        return str.replaceAll("h","u");
    }
}
