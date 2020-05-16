package SelfPractice;

import java.util.Arrays;

public class task13 {
        public static void main(String[] args ){
            middleWord("I love Java");
        }
        public static void middleWord(String str){
            String[] words = str.split(" ");
            String s = Arrays.toString(words);
            System.out.println(s.substring(4,8));
        }
}
