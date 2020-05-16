package Day7;


public class task2 {
    public static void main(String[] args) {
        String text = "software DEVOLOPER inc";
      System.out.println(text.toUpperCase());
        System.out.println(text.substring(0,8));

        int s1 = text.indexOf("s");
        int s2 = text.indexOf(" ");
        String s3 = text.substring(s1, s2);
        System.out.println(s3);
        System.out.println(s3.toUpperCase());

    }
}
