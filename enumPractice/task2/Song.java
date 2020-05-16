package enumPractice.task2;

public class Song {
    String name;
    int sellamont;
    int price;
    int total;
    Category category;
    Country country;
    Singer singer;

    public void getTotal(){
        total=sellamont*price;
    }

    public Song(String name, int sellamont, int price, Category category, Country country, Singer singer) {
        this.name = name;
        this.sellamont = sellamont;
        this.price = price;
        this.category = category;
        this.country = country;
        this.singer = singer;
    }
    public void print(){
        System.out.println("Song nami is : " + name);
        System.out.println("Selling amount is : "+ sellamont);
        System.out.println("Selling price : "+ price);
        System.out.println("Total income of a song : "+ total);
        System.out.println("Category is : "+ category);
        System.out.println("Singers country is : "+ country);
        System.out.println("Singers name is : "+ singer);
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", sellamont=" + sellamont +
                ", price=" + price +
                ", total=" + total +
                '}';
    }
}
