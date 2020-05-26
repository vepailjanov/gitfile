package day42.Inheritens.ExtendKeyWord.Ex2;

public class Fruit {
    public String name;

    public Fruit(){}

    public Fruit(String name){
        this.name = name;
    }

    public void print(){
        System.out.println("My Fruit is: " + name);
    }
}
