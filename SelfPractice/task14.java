package SelfPractice;

public class task14 {
    /* Create one method name is reverseString
    This method should have a parameter as String
    And it should reverse that string
    Return the reversed String
    Example 1 :
    String is : Write a Java
    return should be :  avaJ a etirW
    */
    public static void main(String[] args) {
        reverseString("Write a Java");
    }
    public static String reverseString(String str){
        char ch[]=str.toCharArray();
        String reversed="";
        for (int i=ch.length-1; i >=0; i--) {
            reversed+=ch[i];
        }
        System.out.println(reversed);
        return reversed;
    }
}
