package day32.nonAccessModifier.StaticModifier;

public class MyCounter {
    public static int staticCounter = 0;
    public int counter = 0;
    private final String name;
    public MyCounter(String name) {
        this.name = name;
    }
    public void increase() {
        staticCounter++;
        counter++;
    }
    public static void main(String[] args) {
        MyCounter myCounter1 = new MyCounter("myCounter1");
        myCounter1.increase();
        System.out.println(myCounter1.counter);
        MyCounter myCounter2 = new MyCounter("myCounter2");
        myCounter2.increase();
        System.out.println(myCounter2.counter);

    }

}
