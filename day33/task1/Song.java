package day33.task1;

public class Song {
    String name;
    public Category category;
    public Singer singer;

    public Song(String name, Category category, Singer singer) {
        this.name = name;
        this.category = category;
        this.singer = singer;
    }

    void print(){
        System.out.println("Song name is : " + name);
        System.out.println("Category is : " + category);
        System.out.println("Singer is : " + singer);
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", category=" + category +
                ", singer=" + singer +
                '}';
    }
}
