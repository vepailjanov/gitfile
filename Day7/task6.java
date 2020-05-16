package Day7;

public class task6 {
    public static void main(String[] args) {
        //Given two strings, a and b,
        // return the result of putting them together in the order bbaa,
        //
        // e.g. "Hi" and "Bye" returns "ByeByeHiHi".
        //
        String s1 = "Hi";
        String s2 = "Bye";
        System.out.println(s2+s2+s1+s1);
        System.out.println(s2.concat(s2)+s1.concat(s1));

    }
}
