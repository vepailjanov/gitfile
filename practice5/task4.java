package practice5;

import java.util.ArrayList;

public class task4 {
    public static void main(String[] args) {
        System.out.println(languages());
        reversed(languages());
        firstthree(languages());
        BeginTAndEndsSh(languages());
        WithoutEnglish(languages());

    }
    public static ArrayList<String> languages(){
        ArrayList<String> lngs = new ArrayList<>();
        lngs.add("english");
        lngs.add("german");
        lngs.add("chinese");
        lngs.add("spanish");
        lngs.add("turkish");
        lngs.add("chili");
        System.out.println();
        return lngs;

    }
    public static void reversed(ArrayList<String> str){
        for (int i =str.size()-1; i>=0; i--) {
            System.out.println(str.get(i));
        }
        System.out.println();
    }
    public static void firstthree(ArrayList<String> str){
        for (int i =str.size()-1; i>=3; i--) {
            System.out.println(str.get(i));

        }
    }
    public static ArrayList<String> BeginTAndEndsSh(ArrayList<String> str){
        ArrayList<String> result = new ArrayList<>();
        for (String lang : str) {
            if (lang.startsWith("t") && lang.endsWith("sh")){
                result.add(lang);
            }
        }
        System.out.println(result);
        return result;
    }
    public static ArrayList<String> WithoutEnglish(ArrayList<String> str) {
        ArrayList<String> result = new ArrayList<>();
        for (String eng : str) {
            if (!eng.equals("english")){
                result.add(eng);
            }
        }
        System.out.println(result);
        return result;
    }
}
