package exceptionsPractice;

public class runtime {
    public static void main(String[] args) {
        try{
            int result = 5 / 0;
        }catch (Exception e){
            System.out.println("Arithmetic Exception");
        }
    }


}
