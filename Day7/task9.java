package Day7;

public class task9 {
    public static void main(String[] args) {
        String str = "Good morning everyone!";
        char ch = str.charAt(1);
        int ind = str.indexOf("e");
        String [] str1 = str.split(" ");
        for (int i = 0; i <str1.length; i++) {
            System.out.println("=====>" + str1[i].toUpperCase());
        }
            String str2 = str.replace("morning","evening");
        System.out.println(str2.toUpperCase());
        int str3 = str.length();
        for (int i =str.length(); i > 0; i--) {
            System.out.println();
        }

    }
}
