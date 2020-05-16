package practice5;

public class task1 {
    public static void main(String[] args) {
        System.out.println(vowel("I love java"));
        System.out.println(Isequal("hello", "hello"));
    }

    public static int vowel(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='o'||str.charAt(i)=='i'||str.charAt(i)=='e')
            count++;
        }
        return count;
    }
    public static boolean Isequal(String str1, String str2){
        return vowel(str1)==vowel(str2);
    }
}