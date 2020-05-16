package day33.JavaEnum;

public class Movies {
    String name;
    Categories bookcategories;

    public Movies(String name, Categories bookcategories) {
        this.name = name;
        this.bookcategories = bookcategories;
    }
    public void print(){
        System.out.println(name);
        System.out.println(bookcategories);
    }
    @Override
    public String toString() {
        return "Movies{" +
                "name='" + name + '\'' +
                ", bookcategories=" + bookcategories +
                '}';
    }
}
