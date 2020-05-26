package day42.Inheritens.ExtendKeyWord.Ex2;

public class Store {
    public static void main(String[] args) {
        Banana banana = new Banana();
        banana.name = "Banana";
        banana.print();


        Apple apple = new Apple("Green apple");
        apple.print();
    }
}
