package exceptionsPractice;

public class task1 {
    public static void main(String[] args) {
        String str = "hello";
        try{
            char str2 = str.charAt(2);
            throw new Exception("ru serious?");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
