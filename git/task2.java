package git;

public class task2 {
    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>","Yay"));
        System.out.println(extraEnd("ab"));
        System.out.println(firstHalf("hellothere"));
        System.out.println(withoutEnd("a"));
        System.out.println(comboString("hello","hithere"));
        System.out.println(nonStart("hello","baby"));
        System.out.println(left2("samsyk"));
    }
    public String makeTags(String tag, String word) {
        return "<"+tag+">"+word+"</"+tag+">";
    }

    public static String makeOutWord(String out, String word) {
        String part1 = out.substring(0,2);
        String part2 = out.substring(2,4);
        return part1+word+part2;

    }
    public static String extraEnd(String str) {
        if (str.length()<2){
            return str;
        }
        return str.substring(0,2);
    }

    public static String firstHalf(String str) {
        return str.substring(0,(str.length()/2));
    }

    public static String withoutEnd(String str) {
        if (str.length()<2){
            return str;
        }
        return str.substring(1,(str.length()-1));
    }
    public static String comboString(String a, String b) {
      if (a.length() < b.length()){
          return a+b+a;
      }
        return b+a+b;
    }

    public static String nonStart(String a, String b) {
        return a.substring(1,a.length()).concat(b.substring(1,b.length()));
    }

    public static String left2(String str) {
        return str.substring(2,str.length())+str.substring(0,2);
    }

    public String theEnd(String str, boolean front) {
if (front==true){
    return str.substring(0,1);
}
return str.substring(str.length()-1);
    }

    public boolean endsLy(String str) {
        if(str.endsWith("ly")){
            return true;
        }
        return false;
    }

}
