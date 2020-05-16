package day20;

public class task1 {
    public static void main(String[] args) {
        String str1 = "john";
        String str2 = "john";
        String str3 = "john";
        System.out.println(isEqual(str1,str2));
        System.out.println(isEqual(str1, str2, str3));
    }
    public static boolean isEqual(String str1, String str2){
      return str1.length()==str2.length();
    }
    public static boolean isEqual(String str1, String str2, String str3){
            if (str1.equals(str2)&&str2.equals(str3)){
                return true;
            }else {
                return false;
            }
    }
}
