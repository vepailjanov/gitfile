package dateAndTimePractice;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class time {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        int hour = localTime.getHour();
        int minute = localTime.getMinute();
        int second = localTime.getSecond();

        LocalTime custom = LocalTime.of(16, 43, 32);
        DateTimeFormatter TimeFormatter1 = DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG);
        DateTimeFormatter TimeFormatter2 = DateTimeFormatter.ofPattern("HH:mm:ss a");
        String formattedTime = custom.format(TimeFormatter2);

    }
    @Test
    public void timeChek(){
        LocalTime custom = LocalTime.of(16, 43, 55);
        LocalTime actual = custom.minusHours(1).minusMinutes(12).minusSeconds(32);
        Assert.assertEquals("15:31:23",actual.toString());
    }
}
