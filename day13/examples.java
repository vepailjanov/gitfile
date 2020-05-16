package day13;

public class examples {
    public static void main(String[] args) {
        int result = 0;
        int i = 50;
        while(i<=100){
            result = result + i;
            System.out.println(i);
            result += i;
            i++;
        }
        System.out.println(result);
    }
}
