package day33.JavaRecursion;

public class recursion10 {
    public static void main(String[] args) {
        recursion10 num10 = new recursion10();
        System.out.println(num10.factorial(5));
    }

    public int factorial(int i){
        if (i==1){
            return 1;
        }
        return factorial(i -1)*i;
    }
}
