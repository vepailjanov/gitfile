package dateAndTimePractice;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Formatter;

public class dateAndtime {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
        System.out.println(localTime.format(DateTimeFormatter.ofPattern("HH mm ss a")));
    }
}
