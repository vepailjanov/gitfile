package git;

import org.junit.Assert;
import org.junit.Test;
import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class test {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.of(2020,05,18,9,00,00);
        LocalDateTime projectday = LocalDateTime.of(2020,05,22,9,00,00);
    }


    @Test
    public void testDate(){
        LocalDateTime today = LocalDateTime.of(2020,05,18,9,00,00);
        LocalDateTime projectday = LocalDateTime.of(2020,05,22,9,00,00);
        LocalDateTime yesterday = today.minusDays(1);
        int onlyDate = today.getYear();
        Assert.assertNotEquals(today,projectday);
        Assert.assertNotEquals(today,yesterday);
        Assert.assertEquals(2020,onlyDate);

    }
}
