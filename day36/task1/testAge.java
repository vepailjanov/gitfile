package day36.task1;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Period;

public class testAge {
    public static Period dob(LocalDate localDate1, LocalDate localDate2){
        return Period.between(LocalDate.of(1988,8,14),LocalDate.now());
    }
    @Test
    public void testage(){
        LocalDate date1 = LocalDate.of(1988,8,14);
        LocalDate date2 = LocalDate.now();
        Period period = Period.between(date1,date2);
        Assert.assertEquals(period.toString(),period.toString());
    }
}
