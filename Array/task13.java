package Array;

public class task13 {
    public static void main(String[] args) {
        System.out.println(CheckLength("hello", "hello"));
    }
    public static String CheckLength (String str1, String str2){
        if (str1.length()==str2.length()){
            return "true";
        }
        else{
            return "false";
        }

    }
}
