package day10;

public class tasks {
    int i1;
    int i2;

    public void chekc(){
        if (i1==i2&&i2==i1){
            System.out.println("Check method is ; " + true);
        }
    }

    public tasks(int i1, int i2) {
        this.i1 = i1;
        this.i2 = i2;
    }
    void print(){
        System.out.println(i1);
        System.out.println(i2);
    }

    @Override
    public String toString() {
        return "tasks{" +
                "i1=" + i1 +
                ", i2=" + i2 +
                '}';
    }

    public static void main(String[] args) {
        tasks task1 = new tasks(5,5);
        task1.chekc();
        task1.print();

    }
}