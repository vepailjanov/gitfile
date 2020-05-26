package git;

public class task3 {
    public static void main(String[] args) {
        System.out.println(nTwice("hello", 1));
        System.out.println(twoChar("hallyma", 3));
        System.out.println(lastChars("hello", "darling"));

    }

    public static String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    public static String twoChar(String str, int index) {
        if (index > str.length() - index || str.length() == 0) {
            return str.substring(0, 2);
        }
        return str.substring(index + 1);
    }

    public static String lastChars(String a, String b) {
        if (a.isEmpty() || b.isEmpty()) {
            a = "@";
            b = "@";
        }
        char result = a.charAt(0);
        return a.substring(0) + (b.length() - 1);
    }
    public boolean in3050(int a, int b) {
        if (a>=30&&a<=50&&b>=30&&b<=50){
            return true;
        }
        return false;
    }

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if(cigars>=40&&cigars<=60&&isWeekend==false){
            return true;
        }
        if(cigars>60&&isWeekend==true){
            return true;
        }
        return false;
    }
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if(speed<=60&&isBirthday==false||speed<=65&&isBirthday==true){
            return 0;
        }
        if(speed>=61&&speed<=80&&isBirthday==false||speed>=61&&speed<=85&&isBirthday==true){
            return 1;
        }
        return 2;
    }
}

