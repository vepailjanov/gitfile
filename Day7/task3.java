package Day7;

public class task3 {
    public static void main(String[] args) {
        //  Write a Java program to replace all the 'd' characters with 'f' characters
        //      input: The quick brown fox jumps over the lazy dog.
        //      output: The quick brown fox jumps over the lazy fog.
        String Mys = "The quick brown fox jumps over the lazy dog";
        System.out.println(Mys.replaceAll("d", "f"));
        System.out.println(Mys.replaceAll("[a,t,e]", "f"));
        System.out.println(Mys.replaceAll("[a,t,e]", "f"));
    }

}
