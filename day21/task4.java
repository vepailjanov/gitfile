package day21;

import java.util.ArrayList;

public class task4 {
    public static void main(String[] args) {
        ArrayList<String> languages = languageList();
        System.out.println(languages);
    }
    // create a method that will return list of languages
    public static ArrayList<String> languageList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Russian");
        list.add("Turkmen");
        list.add("Tajik");
        list.add("Turkish");
        list.add("Kazakh");
        list.add("English");
        list.add("Uzbek");
        list.add("French");
        list.add("Spanish");
        list.add("German");

        list.add("English");
        list.add("Turkish");
        list.add("Vietnamese");
        list.add("Indonesian");
        list.add("Javanese");
        list.add("Spanish");

        return list;
    }

    // create a method that will print list of Strings in reverse order
    public static void reverse(ArrayList<String> list){
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
    public static void firstThree(ArrayList<String> list){
        for (int i = 0; i <3 ; i++) {
            System.out.println(list.get(i));
        }
    }
        public static void str(ArrayList<String> list){
            for (int i = 0; i <languageList().size() ; i++) {
            }
        }

}
