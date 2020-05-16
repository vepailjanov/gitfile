package day33.JavaRecursion;

public class JavaRecursionFactorial {
    public static void main(String[] args) {
        JavaRecursionFactorial task = new JavaRecursionFactorial();
        task.factorial(5);
        System.out.println(task.factorial(5));
    }
    public int factorial(int i){
        if (i==1){
            return 1;
        }
        return factorial(i-1)*i;
    }
}
