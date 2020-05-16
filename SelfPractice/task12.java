package SelfPractice;

public class task12 {
    public static void main(String[] args) {
        dash("hello");

    }
    public static String dash(String str){
        str=str.replaceAll("","-");
        str=str.substring(1,10);
        System.out.println(str);
        return str;
    }
}
