package day35.manupilating;

import org.junit.Assert;
import org.junit.Test;
import sun.util.resources.LocaleData;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class LocalDatetesting {
    @Test
    public void tetsplus(){
        LocalDate today = LocalDate.now();
        LocalDate actual = today.plusDays(1).plusMonths(1).plusYears(1);
        Assert.assertEquals("2021-06-12",actual.toString());
    }
    @Test
    public void testminus(){
        LocalDate today = LocalDate.now();
        LocalDate actual = today.minusDays(1).minusMonths(1).minusYears(1);
        Assert.assertEquals("2019-04-10",actual.toString());
    }
    @Test
    public void projectdaytest(){
        LocalDate today = LocalDate.now();
        LocalDate projectdate = today.plusDays(5);
        Assert.assertEquals("2020-05-16",projectdate.toString());
        Assert.assertEquals(2020,projectdate.getYear());
        Assert.assertEquals(5,projectdate.getMonthValue());
        Assert.assertEquals(Month.MAY,projectdate.getMonth());
        Assert.assertEquals(16,projectdate.getDayOfMonth());
        Assert.assertEquals(DayOfWeek.SATURDAY,projectdate.getDayOfWeek());

    }

}
