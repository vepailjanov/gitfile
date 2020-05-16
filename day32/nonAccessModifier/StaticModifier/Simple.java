package day32.nonAccessModifier.StaticModifier;

public class Simple {
    //class member/variable/field
    static int a;

    //instance member/variable/field
    int b;

    void increase() {
        a++;
        b++;
    }
    public void print(){
        System.out.println("a :" + a);
        System.out.println("b :" + b);
    }

    public static void main(String[] args) {
        Simple s1 = new Simple();
        s1.increase();
        s1.print();

        Simple s2 = new Simple();
        s2.increase();
        s2.print();

    }

}
