package day33.JavaEnum;

import java.util.ArrayList;

public class Netflix {
    public static void main(String[] args) {
        Movies movie1 = new Movies("The act", Categories.CRIME);
        movie1.print();
        System.out.println();
        Movies movie2 = new Movies("Us", Categories.DETECTIVE);
        movie2.print();
        System.out.println();
        Movies movie3 = new Movies("You", Categories.DRAMA);
        movie3.print();
        System.out.println();
        Movies movie4 = new Movies("Devil inside", Categories.HORROR);
        movie4.print();

    }

}
