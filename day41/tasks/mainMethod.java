package day41.tasks;

import java.util.ArrayList;
import java.util.List;

public class mainMethod {
    public static void main(String[] args) {
       /* Create books as with following data:
        Mark Twain: Five Novels (Leather-bound Classics)
        by Mark Twain and Elizabeth Boyle Machlan PhD | Nov 1, 2011
        Leather Bound $16.69
        Hardcover $10.49
        Audible Audiobook $0.00

        Jane Austen: The Complete Works 7-Book Boxed Set: Classics hardcover boxed set (Penguin Clothbound Classics)
        by Jane Austen and Coralie Bickford-Smith | Nov 24, 2015
        Hardcover $109.61


        Little Women (Puffin in Bloom)
        by Louisa May Alcott  | Aug 28, 2014
        Hardcover $11.99
        Audible Audiobook $0.00

        */

        Book book1 = new Book("Five Novels", "Mark Twain and Elizabeth Boyle Machlan",
                "Nov 1, 2011", "$16.69", "$10.49", "$0.00");
        book1.hasThreePrice();

        Book book2 = new Book();
        book2.setName("The Complete Works 7-Book Boxed Set");
        book2.setAuthor("Jane Austen and Coralie Bickford-Smith");
        book2.setPublishedDate("Nov 24, 2015");
        book2.setHardCoverPrice("$109.61");
        book2.hasThreePrice();

        Book book3 = new Book();
        book3.setName("Little Women (Puffin in Bloom)");
        book3.setAuthor("Louisa May Alcott");
        book3.setPublishedDate(" Aug 28, 2014");
        book3.setHardCoverPrice("$11.99");
        book3.setAudioBookPrice("0.00");
        book3.hasThreePrice();

        System.out.println(book2.hasThreePrice());
    }

}
