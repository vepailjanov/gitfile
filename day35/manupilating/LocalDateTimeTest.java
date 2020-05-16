package day35.manupilating;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {
    public static void main(String[] args) {


    }
    @Test
    public void checkUpdateplus(){
        LocalDateTime customMade = LocalDateTime.of(2020,05,11,20,13,33);
        LocalDateTime localDateTime = customMade.plusYears(1).plusMonths(1).plusDays(1).plusHours(1).plusMinutes(1).plusSeconds(1);
        Assert.assertNotEquals(customMade,localDateTime);
        String actual = localDateTime.format(DateTimeFormatter.ofPattern("HH:mm MM dd yyy"));
        String expected = "21:14 06 12 2021";
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void checkUpdateminus(){
        LocalDateTime customMade = LocalDateTime.of(2020,05,11,20,13,33);
        LocalDateTime localDateTime = customMade.minusYears(1).minusMonths(1).minusDays(1).minusHours(1).minusMinutes(1).minusSeconds(1);
        Assert.assertNotEquals(customMade,localDateTime);
        String actual = localDateTime.format(DateTimeFormatter.ofPattern("HH:mm MM dd yyy"));
        String expected = "19:12 04 10 2019";
        Assert.assertEquals(expected,actual);
    }
}
