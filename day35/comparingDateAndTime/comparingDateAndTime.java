package day35.comparingDateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class comparingDateAndTime {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate yesterday = today.minusDays(1);
        boolean before = yesterday.isBefore(today);
        boolean after = today.isAfter(yesterday);
        boolean equal = today.isEqual(yesterday);
        boolean leapyear = today.isLeapYear();


        LocalTime now = LocalTime.of(22,44,22);
        LocalTime earlier = now.minusHours(2).minusMinutes(22).minusSeconds(11);
        boolean before1 = earlier.isBefore(now);
        boolean after1 = now.isAfter(earlier);
    }
}
