package day37.tasks.multipleCatch;

public class multipleCatch {
    public static void main(String[] args) {

        try {
            String str = "";
            int i22 = 5/0;
            char ch = str.charAt(0);
        }catch (NullPointerException e1){
            System.out.println(e1.getMessage());
        }catch (IndexOutOfBoundsException e2){
            System.out.println(e2.getMessage());

        }catch (RuntimeException e3){
            System.out.println(e3.getMessage());

        }
    }
}
