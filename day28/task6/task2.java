package day28.task6;

public class task2 {
    public static void main(String[] args) {
        Login login1 = Login.create("","");
        login1.checkAndPrint();
        Login login2 = Login.create("mukalak","mukalashka2019");
        login2.checkAndPrint();
    }
}
