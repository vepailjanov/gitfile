package day42.Inheritens.ExtendKeyWord.Ex2;

public class Apple extends Fruit {

    //constructor are not inherited
    //but you can reuse them using super keyword
    public Apple(String name){
        super(name);
        super.name = "Red Apple";
    }
}
