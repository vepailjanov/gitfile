package day30.ConstructerEx;
class movies{
    String name;
    int year;
    int stars;
    public movies(String name, int year){
        this.name = name;
        this.year = year;
    }
    public movies(String name, int year, int stars){
        this (name,year);
        this.stars = stars;

    }
    public void print() {
        System.out.println("Movie Name : " + this.name );
        System.out.println("Movie Year : " + this.year );
        System.out.println("Movie Stars : " + this.stars );
    }
}
public class Movie {
    public static void main(String[] args) {
        movies movie1 = new movies("GreatGatsby", 2005, 5);
        movie1.print();
        movies movie2 = new movies("The Act", 2019,5);
        movie1.print();
        movies movie3 = new movies("Untouchable", 2015,4);
        movie1.print();
        movies movie4 = new movies("You", 2020,5);
        movie1.print();

    }
}
