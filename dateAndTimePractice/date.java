package dateAndTimePractice;

import org.junit.Assert;
import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class date {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        int dayOfYear = localDate.getDayOfYear();
        int dayOfMonth = localDate.getDayOfMonth();
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        Month month = localDate.getMonth();

        LocalDate today = LocalDate.of(2020,05,11);
        System.out.println(today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println(today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println(today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println(today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(today.format(DateTimeFormatter.ofPattern("d|MM|yyy")));
    }
    @Test
    public void dateCheking(){
        LocalDate today = LocalDate.now();
        Assert.assertEquals("2020-05-11",today.toString());

        LocalDate yesterday = LocalDate.of(2020,05,10);
        Assert.assertEquals("2020-05-10",yesterday.toString());
    }
}


